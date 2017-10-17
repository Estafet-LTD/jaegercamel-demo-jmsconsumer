package com.estafet.jaegarcamel.demo.jmsconsumer;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by ivo.costa@estafet.com on 17/10/2017.
 */

@Component
public class JmsConsumer extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        String rabbitmqUrl = System.getenv("RABBITMQ_URL");
        String fake_url = System.getenv("FAKESERVICE_URL");

        from("rabbitmq://" + rabbitmqUrl + "/amq.direct?autoDelete=false&routingKey=register")
                .to("http://" + fake_url + "/fakeservice")
                .to("log:todo-db")
                .to("log:registered");
    }
}

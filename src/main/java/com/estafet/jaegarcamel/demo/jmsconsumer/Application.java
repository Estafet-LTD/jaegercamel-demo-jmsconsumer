package com.estafet.jaegarcamel.demo.jmsconsumer;

import com.uber.jaeger.Configuration;
import org.apache.camel.opentracing.starter.CamelOpenTracing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by ivo.costa@estafet.com on 17/10/2017.
 */
@SpringBootApplication
@CamelOpenTracing
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public io.opentracing.Tracer jaegerTracer() {
        Configuration configuration = new Configuration("JmsConsumer",
                Configuration.SamplerConfiguration.fromEnv(),
                Configuration.ReporterConfiguration.fromEnv());

        return configuration.getTracer();
    }
}

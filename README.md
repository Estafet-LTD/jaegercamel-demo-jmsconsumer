# jaegercamel-demo-jmsconsumer
This project is part of a Camel demo with Jaeger using microservices. This project is deployable to Openshift using S2I
See also jaegercamel-demo1 and jaegarcamel-demo2

---


This application expects the following environment variables
+ RABBITMQ_URL - 
+ FAKESERVICE_URL - [hostname]:8080 //See jaegercamel-demo-fakeservice
+ JAEGER_SAMPLER_TYPE	 - const
+ JAEGER_SAMPLER_PARAM - 1
+ JAEGER_SAMPLER_MANAGER_HOST_PORT - [hostname]:5778
+ JAEGER_AGENT_HOST - [hostname]

In this application the service name is in the code and the variable is not required

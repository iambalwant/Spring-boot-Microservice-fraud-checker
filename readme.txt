Docker commands
docker compose ps


open http://localhost:5050 to connect with postgres database
open http://localhost:8761/ to connect with eureka server

To create another instance of microservice
Edit Configuration → Add second config → VM Options:
-Dserver.port=9998



Way's we are going to communicate with our microservices
1.RestTemplate
2.Distributed Tracing - Eureka Server

For Api gateway we used spring cloud apigateway

eureka : http://eureka:password@localhost:8761/eureka/web

Using keyclock for auth
url: localhost:9877 and create new realms
to get endpoint : http://localhost:9983/realms/spring-boot-microservices-realm/.well-known/openid-configuration
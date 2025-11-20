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

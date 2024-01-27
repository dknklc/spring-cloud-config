# SPRING CLOUD CONFIG 

## 1. Introduction

Keywords: Microservices, Spring Cloud Config Server, Spring CLoud Config Client, RabbitMQ, Webhook

This is a project aimed to use Spring Cloud Config Server for externalized configuration in a distributed system.With the Config Server, you have a central place to manage your configuration for your application across all environments such as dev, qa or prod.

## 2. Overview

In this project, there are 3 business related microservices named as accounts, loans and cards.Also, there is a microservice named as configserver for Spring Cloud Config Server project. 

#### `Business related microservices`:
act as Config client & load configurations during startup by connecting to Configuration service.

#### `Spring Cloud Config Server`:
load all configurations by connecting to central repository.

#### `Central Repository`:
where all configurations are stored. The configuration related information is kept under a repo called configuration in my Github.



#### To overcome how to refresh configurations at runtime, Spring Cloud Bus & Sping Cloud Config Monitor are used.
#### Spring Cloud Bus : facilitates seamless communication between all connected application instances by establishing a convenient event broadcasting channel. It offers an implementation for AMQP brokers, such as RabbitMQ and Kafka, enabling efficient communication across the application ecosystem.
#### Spring Cloud Config Monitor : enables the triggering of configuration change events in the Config Service. By exposing the `/monitor` endpoint, it facilitates the propagation of these events to all listening application via the Bus. The Monitor library allows push notifications from popular code repository providers such as GitHub, GitLab, and BitBucket. You can configure Webhooks in these services to automatically send a POST request to the Config Service after each new push to the configuration repository.

## 3. How to run

To generate Docker images of these services, I have used both Dockerfile and Google Jib plugin.However, to make it much easier, you can generate the images of these services by the help of Google Jib as follows for the accounts service :

```sh
cd accounts
mvn compile jib:dockerBuild
```
This command will create a Docker image named as dekankilic/accounts:s6. By following the same idea, you can generate images of cards, loans and configserver. Then, you can go inside the directory docker-compose/default by the following command :
```sh
cd docker-compose/default
```
Finally, you can use docker-compose.yml file to run all these containers :
```sh
docker compose up -d
```


## Technologies
- Java 17
- Spring Boot 3.2
- Spring Cloud Config
- RabbitMQ
- Open API Documentation
- Spring Data JPA
- H2 In Memory Database
- Restful API
- Maven
- Docker
- Docker Compose
- Google Jib

# Spring Boot + Docker

Progetto Spring Boot che espone un'api rest ("/hello").

Creiamo il Dockerfile:

``` yaml
FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} myapp.jar
ENTRYPOINT ["java","-jar","/myapp.jar"]
```

Dopodichè buildiamo l'immagine e la tagghiamo come "springio/gs-spring-boot-docker":

` docker build -t springio/gs-spring-boot-docker .`

Dopodichè startiamo il container su porta interna ed esterna 8080:

` docker run -p 8080:8080 springio/gs-spring-boot-docker `

Per stoppare il container basta lanciare il comando:

` docker ps `

Così facendo recuperiamo l'id del container e poi:

` docker stop IDCONTAINER`


**Per maggiori info:** https://spring.io/guides/gs/spring-boot-docker/
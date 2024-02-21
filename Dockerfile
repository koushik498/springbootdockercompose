FROM openjdk:17

MAINTAINER koushik

COPY target/springjpa.jar springjpa.jar

EXPOSE 9090

ENTRYPOINT [ "java","-jar","/springjpa.jar"]
FROM openjdk:11-jre-stretch
MAINTAINER hellozjf <908686171@qq.com>

# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE}  /app/app.jar

# Add application.properties
ADD src/main/resources/application.properties   /app/application.properties

VOLUME /log
VOLUME /cookie
EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-jar", "/app/app.jar", "--spring.config.location=file:/app/application.properties"]

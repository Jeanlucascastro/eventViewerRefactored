from openjdk:12-alpine
MAINTAINER github/jeanlucascastro
COPY ./target/eventViewer-0.0.1-SNAPSHOT.jar /app/eventviewer-0.0.1-SNAPSHOT.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "eventviewer-0.0.1-SNAPSHOT.jar"]
EXPOSE 3020
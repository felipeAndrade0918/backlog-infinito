FROM openjdk:11-jdk-slim
ENV GIANT_BOMB_API_KEY=YOUR-KEY-HERE
COPY target/backlog-infinito-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "/backlog-infinito-0.0.1-SNAPSHOT.jar"]

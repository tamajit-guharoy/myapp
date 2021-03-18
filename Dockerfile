FROM openjdk:11-jre-slim
COPY target/myapp-0.0.1-SNAPSHOT.jar /
CMD ["java","-jar","myapp-0.0.1-SNAPSHOT.jar"]

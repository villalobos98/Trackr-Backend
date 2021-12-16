FROM openjdk:11
COPY ./target/Trackr-0.0.1-SNAPSHOT.jar Trackr-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","trackr-0.0.1-SNAPSHOT.jar"]
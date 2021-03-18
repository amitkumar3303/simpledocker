FROM openjdk:8
ADD target/helloConsumer.jar helloConsumer.jar
EXPOSE 5052
ENTRYPOINT ["java","-jar","helloConsumer.jar"]
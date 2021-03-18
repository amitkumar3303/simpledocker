FROM openjdk:8
ADD target/helloProducer.jar helloProducer.jar
EXPOSE 6062
ENTRYPOINT ["java","-jar","helloConsumer.jar"]
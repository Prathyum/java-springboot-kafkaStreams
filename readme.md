# Spring Boot Application for Kafka Streams

This project consists of two Spring Boot applications that communicate with each other using Kafka topics. The first application provides a REST interface that publishes raw messages to a Kafka topic named "raw_messages". The second application is based on Kafka Streams and consumes messages from the "raw_messages" topic, calculates the average, and publishes the result to a Kafka topic named "average".

## Getting Started

To get started with this project, follow the steps below:

1. Clone the repository on your local machine.
2. Open the first Spring Boot application in your preferred IDE or text editor.
3. Configure the Kafka connection properties in the `application.properties` file according to your environment.
4. Run the first application and verify that it is running correctly by sending a raw message to the REST endpoint.
5. Open the second Spring Boot application in a separate instance of your IDE or text editor.
6. Configure the Kafka connection properties in the `application.properties` file according to your environment.
7. Run the second application and verify that it is running correctly by consuming messages from the "raw_messages" topic and publishing the average to the "average" topic.

## Components

### Raw Messages Producer

The Raw Messages Producer is a Spring Boot application that provides a REST interface to publish raw messages to the "raw_messages" Kafka topic. The REST endpoint is exposed at `/publish`.

### Average Calculator

The Average Calculator is a Spring Boot application that consumes messages from the "raw_messages" topic using Kafka Streams. It calculates the average of the messages and publishes the result to the "average" Kafka topic.

## Conclusion

This project demonstrates how to create a Spring Boot application that publishes raw messages to a Kafka topic and another application that consumes messages from the topic, processes them, and publishes the outcome to another topic. With this knowledge, you can build more complex Kafka-based applications that leverage the full power of the Kafka Streams library.

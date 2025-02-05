package com.example.service;

import com.example.config.RabbitMQConfig;
import com.example.dto.RabbitMessageDTO;

import io.github.cdimascio.dotenv.Dotenv;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.*;

import java.nio.charset.StandardCharsets;

public class RabbitMQConsumer {
    private static final Dotenv dotenv = Dotenv.load();
    private static final String QUEUE_NAME = dotenv.get("RABBITMQ_QUEUE");

    public void startConsumer() {
        try {
            Connection connection = RabbitMQConfig.createConnection();
            Channel channel = connection.createChannel();

            channel.queueDeclare(QUEUE_NAME, true, false, false, null);
            System.out.println(" [*] Waiting for messages...");

            DeliverCallback deliverCallback = (consumerTag, delivery) -> {
                String messageBody = new String(delivery.getBody(), StandardCharsets.UTF_8);
                processMessage(messageBody);
            };

            channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> {});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void processMessage(String messageBody) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            RabbitMessageDTO message = objectMapper.readValue(messageBody, RabbitMessageDTO.class);

            System.out.println("Received message: " + message);
        } catch (Exception e) {
            System.err.println("Failed to parse message: " + e.getMessage());
        }
    }
}

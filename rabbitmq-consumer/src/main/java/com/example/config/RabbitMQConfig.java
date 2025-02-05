package com.example.config;

import io.github.cdimascio.dotenv.Dotenv;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RabbitMQConfig {
    private static final Dotenv dotenv = Dotenv.load();

    private static final String HOST = dotenv.get("RABBITMQ_HOST");
    private static final int PORT = Integer.parseInt(dotenv.get("RABBITMQ_PORT"));
    private static final String USERNAME = dotenv.get("RABBITMQ_USERNAME");
    private static final String PASSWORD = dotenv.get("RABBITMQ_PASSWORD");

    public static Connection createConnection() throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(HOST);
        factory.setPort(PORT);
        factory.setUsername(USERNAME);
        factory.setPassword(PASSWORD);
        factory.useSslProtocol();

        return factory.newConnection();
    }
}

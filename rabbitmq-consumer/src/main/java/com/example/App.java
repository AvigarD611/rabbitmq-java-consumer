package com.example;

import com.example.service.RabbitMQConsumer;

public class App 
{
    public static void main( String[] args )
    {
        RabbitMQConsumer consumer = new RabbitMQConsumer();
        consumer.startConsumer();
    }
}

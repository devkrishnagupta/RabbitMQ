package com.devkrishnagupta.rabbitmq.consumer;


import com.devkrishnagupta.rabbitmq.config.RabbitMQConfig;
import com.devkrishnagupta.rabbitmq.entities.OrderDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consume(OrderDto orderDto){
        System.out.println("consumer is able to consume messages from queues: "+ orderDto);
    }
}

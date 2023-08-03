package com.devkrishnagupta.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public final static String QUEUE = "rabbit_mq_queue";
    public final static String EXCHANGE = "rabbit_mq_exchange";
    public final static String ROUTING_KEY = "rabbit_mq_r_key";

    @Bean
    public Queue queue(){
        return new Queue(QUEUE);
    }

    @Bean
    public DirectExchange exchange(){
        return new DirectExchange(EXCHANGE);
    }

    @Bean
    public Binding binding(Queue queue, DirectExchange directExchange){
        return BindingBuilder.bind(queue).to(directExchange).with(ROUTING_KEY);
    }
}

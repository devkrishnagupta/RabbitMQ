package com.devkrishnagupta.rabbitmq.producers;

import com.devkrishnagupta.rabbitmq.config.RabbitMQConfig;
import com.devkrishnagupta.rabbitmq.entities.Order;
import com.devkrishnagupta.rabbitmq.entities.OrderDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RMQProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/order")
    public OrderDto placeOrder(@RequestBody Order order){
        OrderDto orderDto = new OrderDto(order, "Order Places", "Hi Producer Your Order is placed ");
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, orderDto);
        return orderDto;
    }
}

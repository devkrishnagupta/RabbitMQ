package com.devkrishnagupta.rabbitmq.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDto {
    private Order order;
    private String orderStatus;
    private String message;
}

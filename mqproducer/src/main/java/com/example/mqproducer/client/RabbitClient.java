package com.example.mqproducer.client;

import com.example.mqproducer.configuration.MqproducerProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitClient {

  @Autowired
  private RabbitTemplate rabbitTemplate;

  @Autowired
  private MqproducerProperties mqproducerProperties;

  public void sendMessage(String message) {
    rabbitTemplate.convertAndSend(mqproducerProperties.getExchange(),mqproducerProperties.getRoutingKey(), message);
  }

}

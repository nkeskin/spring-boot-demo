package com.example.mqproducer.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MqProducerConfig {

  @Autowired
  private MqproducerProperties mqproducerProperties;

  @Bean
  public Queue queue() {
    return new Queue(mqproducerProperties.getQueue(), mqproducerProperties.isDurable());
  }

  @Bean
  public TopicExchange topicExchange() {
    return new TopicExchange(mqproducerProperties.getExchange());
  }

  @Bean
  public Binding binding(Queue queue, TopicExchange topicExchange) {
    return BindingBuilder.bind(queue).to(topicExchange).with(mqproducerProperties.getRoutingKey());
  }


}

package com.example.mqconsumer.configuration;

import com.example.mqconsumer.client.MqMessageReceiver;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MqConsumerConfig {

  @Autowired
  private MqConsumerProperties mqconsumerProperties;

  @Bean
  public MessageListenerAdapter listenerAdapter(MqMessageReceiver mqMessageReceiver) {
    return new MessageListenerAdapter(mqMessageReceiver, "receive");
  }

  @Bean
  public SimpleMessageListenerContainer container(ConnectionFactory connectionFactory,
                                                  MessageListenerAdapter listenerAdapter) {
    SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
    container.setConnectionFactory(connectionFactory);
    container.setQueueNames(mqconsumerProperties.getQueue());
    container.setMessageListener(listenerAdapter);
    return container;
  }

}

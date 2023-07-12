package com.example.mqconsumer.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mqconsumer-properties")
@Data
public class MqConsumerProperties {

  private String queue;

}

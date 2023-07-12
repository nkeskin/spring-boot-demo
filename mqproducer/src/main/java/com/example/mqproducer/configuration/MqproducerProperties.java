package com.example.mqproducer.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mqproducer-properties")
@Data
public class MqproducerProperties {

  private String exchange;
  private String queue;
  private String routingKey;
  private boolean durable;

}

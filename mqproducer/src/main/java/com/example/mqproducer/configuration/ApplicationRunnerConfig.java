package com.example.mqproducer.configuration;

import com.example.mqproducer.client.RabbitClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerConfig implements ApplicationRunner {

  @Autowired
  private RabbitClient rabbitClient;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    rabbitClient.sendMessage("for opening connection");
  }

}

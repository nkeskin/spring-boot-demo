package com.example.mqconsumer.client;

import org.springframework.stereotype.Component;

@Component
public class MqMessageReceiver {

  public void receive(String message) {
    System.out.println(message);
  }

}

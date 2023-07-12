package com.example.mqproducer.controller;

import com.example.mqproducer.client.RabbitClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

  @Autowired
  private RabbitClient rabbitClient;

  @GetMapping("/produce")
  public String produce() {

    for(int i=0; i<100; i++) {
      rabbitClient.sendMessage("hello my message");
    }

    return "produced";
  }

}

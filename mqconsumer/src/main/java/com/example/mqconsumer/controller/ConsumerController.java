package com.example.mqconsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

  @GetMapping("/consume")
  public String consume() {
    return "consume";
  }

}

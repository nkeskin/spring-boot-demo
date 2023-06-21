package com.example.feign.controller;

import com.example.feign.client.DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

  @Autowired
  private DemoClient demoClient;

  @GetMapping("/feign")
  public String clientCall() {
    return demoClient.callDemo();
  }

}

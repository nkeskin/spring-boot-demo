package com.example.feign.controller;

import com.example.feign.client.DemoClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FeignController {

  @Autowired
  private DemoClient demoClient;

  @GetMapping("/feign")
  public ResponseEntity<String> clientCall() {
    log.info("Calling demo app");
    return demoClient.callDemo();
  }

}

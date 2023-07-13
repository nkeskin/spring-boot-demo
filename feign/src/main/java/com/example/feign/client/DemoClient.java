package com.example.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo")
public interface DemoClient {

  @GetMapping("/hello")
  ResponseEntity<String> callDemo();

}

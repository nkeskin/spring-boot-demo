package com.example.demo.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class HomeControllerTest {

  HomeController homeController = new HomeController();

  @Test
  void testHome() {
    String result = homeController.home();
    Assertions.assertEquals("home", result);
  }
}

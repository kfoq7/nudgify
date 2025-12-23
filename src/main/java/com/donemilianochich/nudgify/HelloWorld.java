package com.donemilianochich.nudgify;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

  @GetMapping("/")
  public String home() {
    return "Hello World!";
  }
}

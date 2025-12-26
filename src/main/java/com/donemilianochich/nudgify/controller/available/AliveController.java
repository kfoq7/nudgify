package com.donemilianochich.nudgify.controller.available;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AliveController {
  @GetMapping("/")
  public String alive() {
    return "Nudgify is running";
  }
}

package com.donemilianochich.nudgify.role;

import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleEntity {
  private Long id;

  private String name;
}

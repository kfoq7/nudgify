package com.donemilianochich.nudgify.user;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

import com.donemilianochich.nudgify.role.RoleEntity;

@Getter
@Setter
public class UserEntity {
  private Long id;

  private String name;

  private String email;

  private String password;

  private Set<RoleEntity> roles = new HashSet<>();
}

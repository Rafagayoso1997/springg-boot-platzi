package com.gsoft.springplatzi.usecase;

import com.gsoft.springplatzi.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class CreateUser {

  private UserService userService;

  public CreateUser(UserService userService) {
    this.userService = userService;
  }
}

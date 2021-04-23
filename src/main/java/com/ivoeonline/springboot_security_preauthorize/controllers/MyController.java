package com.ivoeonline.springboot_security_preauthorize.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @PreAuthorize("hasRole('ADMIN')")
  @RequestMapping("/Admin")
  public String admin() {
    return "Hello from Admin";
  }

  @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
  @RequestMapping("/UserGuest")
  public String userGuest() {
    return "Hello from UserGuest";
  }
  
}

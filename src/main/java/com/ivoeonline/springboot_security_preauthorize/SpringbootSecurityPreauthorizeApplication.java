package com.ivoeonline.springboot_security_preauthorize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringbootSecurityPreauthorizeApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootSecurityPreauthorizeApplication.class, args);
  }

}

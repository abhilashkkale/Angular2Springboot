package com.clairvoyant.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Angular2SpringbootApplication {

  public static void main(String[] args) {
    SpringApplication.run(Angular2SpringbootApplication.class, args);
  }
}

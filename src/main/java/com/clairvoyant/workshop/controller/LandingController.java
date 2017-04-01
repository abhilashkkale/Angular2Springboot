package com.clairvoyant.workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by mohammad on 1/4/17.
 */
@Controller
public class LandingController {
  @GetMapping(value = {"/","/portal"})
  public String landingEndpoint(){
    return "index";
  }

}

package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloRestController {
  @RequestMapping("/greeting")
  @ResponseBody
  public Greeting greeting() {
    Greeting greeting = new Greeting(1, "Hello, World!");
    return greeting;
  }
}

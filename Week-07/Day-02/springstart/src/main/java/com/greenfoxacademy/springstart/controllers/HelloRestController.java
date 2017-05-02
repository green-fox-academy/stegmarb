package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloRestController {
  @RequestMapping("/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "Hello, World!", required = false) String name) {
    Greeting greeting = new Greeting(1, name);
    return greeting;
  }
}

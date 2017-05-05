package com.greenfoxamcademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class GreetingController {

  @RequestMapping("/")
  public String greeting(Model model) {
    Greeting greeting = new Greeting();
    model.addAttribute("color", "color" + greeting.randomColor());
    model.addAttribute("hellos", greeting.getHellos());
    return "greetings";
  }
}

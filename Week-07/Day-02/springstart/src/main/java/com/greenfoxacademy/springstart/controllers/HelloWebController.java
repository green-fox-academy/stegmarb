package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class HelloWebController {
  AtomicInteger count = new AtomicInteger();
  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name", defaultValue = "World", required = false) String name) {
    model.addAttribute("count", count.getAndIncrement());
    model.addAttribute("name", name);
    return "greeting";
  }
}

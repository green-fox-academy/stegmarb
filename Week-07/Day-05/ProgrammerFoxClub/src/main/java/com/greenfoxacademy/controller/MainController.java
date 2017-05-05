package com.greenfoxacademy.controller;

import com.greenfoxacademy.main.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
  @Autowired
  private Fox fox;

  @RequestMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("fox", fox);
    model.addAttribute("tricks", fox.getTricks().size());
    return "index";
  }
}

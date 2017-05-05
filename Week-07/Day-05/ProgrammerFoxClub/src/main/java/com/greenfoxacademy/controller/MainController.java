package com.greenfoxacademy.controller;

import com.greenfoxacademy.main.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

  @RequestMapping("/nutrition")
  public String nutrition() {
    return "nutrition";
  }

  @RequestMapping("/nutrition/change")
  public String changeValue(@RequestParam("food") String food, @RequestParam("drink") String drink) {
    if (food.equals("")) {
      food = "junk food";
    }
    if (drink.equals("")) {
      drink = "sweet drink";
    }
    fox.setDrink(drink);
    fox.setFood(food);
    return "redirect:/nutrition";
  }

  @RequestMapping("/trickCenter")
  public String addTrick() {
    return "trick";
  }
}

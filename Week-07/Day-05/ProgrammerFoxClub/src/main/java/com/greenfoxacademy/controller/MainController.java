package com.greenfoxacademy.controller;

import com.greenfoxacademy.main.Drink;
import com.greenfoxacademy.main.Food;
import com.greenfoxacademy.main.Fox;
import com.greenfoxacademy.main.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {
  Food[] food = Food.values();
  Drink[] drink = Drink.values();
  Trick trick = new Trick();
  String[] tricks = trick.getTricks();
  List<String> trickList = Arrays.asList(tricks);


  @Autowired
  private Fox fox;

  @RequestMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("fox", fox);
    model.addAttribute("tricks", fox.getTricks().size());
    return "index";
  }

  @RequestMapping("/nutrition")
  public String nutrition(Model model) {
    model.addAttribute("foods", food);
    model.addAttribute("drinks", drink);
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
  public String trickPage(Model model) {
    model.addAttribute("tricks", tricks);
    return "trick";
  }

  @RequestMapping("/trickCenter/learn")
  public String addTrick(@RequestParam("tricks") String trick) {
    fox.addTricks(trick);
    for (int i = 0; i < trickList.size(); i++) {
      if (trickList.get(i) == trick) {
        trickList.remove(trickList.get(i));
      }
    }
    return "redirect:/trickCenter";
  }
}

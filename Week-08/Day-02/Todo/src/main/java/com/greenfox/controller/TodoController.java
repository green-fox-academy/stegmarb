package com.greenfox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @RequestMapping("/")
  @ResponseBody
  public String main(Model model) {
    return "This is my first todo";
  }

  @RequestMapping("/list")
  @ResponseBody
  public String list(Model model) {
    return "This is my first todo";
  }
}

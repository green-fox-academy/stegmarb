package com.greenfox.controller;

import com.greenfox.model.ToDo;
import com.greenfox.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping("/")
  public String main(Model model, @RequestParam(value = "isActive", defaultValue = "", required = false) String isActive) {
    if (isActive.equals("true")) {
      List<ToDo> active = new ArrayList<>();
      for (int i = 1; i <= todoRepository.count(); i++) {
        if (todoRepository.findOne(new Long(i)).isActive()) {
          active.add(todoRepository.findOne(new Long(i)));
        }
      }

      model.addAttribute("todos", active);
    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }
    return "todolist";
  }

  @RequestMapping("/list")
  @ResponseBody
  public String list(Model model) {
    return "This is my first todo";
  }
}

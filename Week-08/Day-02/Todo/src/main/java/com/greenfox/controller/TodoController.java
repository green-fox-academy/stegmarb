package com.greenfox.controller;

import com.greenfox.model.ToDo;
import com.greenfox.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;
  private Long id;
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

  @GetMapping("/add")
  public String addPage() {
    return "addNewTodo";
  }

  @PostMapping("/add/new")
  public String addNewTodo(@RequestParam("todo") String todo) {
    todoRepository.save(new ToDo(todo));
    return "redirect:/todo/";
  }

  @RequestMapping("/{id}/delete")
  public String deleteTodo(@PathVariable("id") Long id) {
    todoRepository.delete(id);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/edit")
  public String editTodo(Model model, @PathVariable("id") Long id) {
    model.addAttribute("title", todoRepository.findOne(id).getTitle());
    model.addAttribute("urgent", todoRepository.findOne(id).isUrgent());
    model.addAttribute("done", todoRepository.findOne(id).isDone());
    this.id = id;
    return "edittodo";
  }

  @RequestMapping("/edit/save")
  public String saveChanges(@RequestParam("todo") String todo,
                            @RequestParam(name = "done", required = false) String isDone,
                            @RequestParam(name = "urgent", required = false) String isUrgent) {
    ToDo tempTodo = todoRepository.findOne(id);
    if (!todo.equals("")) {
      tempTodo.setTitle(todo);
    }
    tempTodo.setDone(Boolean.valueOf(isDone));
    tempTodo.setUrgent(Boolean.valueOf(isUrgent));
    todoRepository.save(tempTodo);
    return "redirect:/todo/";
  }
}

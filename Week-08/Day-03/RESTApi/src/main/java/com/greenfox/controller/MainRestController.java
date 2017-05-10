package com.greenfox.Controller;

import com.greenfox.doubled.Doubled;
import com.greenfox.doubled.ErrorMessage;
import com.greenfox.greeter.Student;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage someException(Exception e) {
    return new ErrorMessage("Please provide an input!");
  }

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubled returnDouble(@RequestParam(value = "input") int input) {
    Doubled instance = new Doubled(input);
    instance.doubleValue();
    return instance;
  }

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public Student greetStudent(@RequestParam("name") String name, @RequestParam("title") String title) {
    return new Student(name, title);
  }
}

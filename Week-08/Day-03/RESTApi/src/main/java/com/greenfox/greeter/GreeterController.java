package com.greenfox.greeter;

import com.greenfox.doubled.Doubled;
import com.greenfox.doubled.ErrorMessage;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreeterController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage someException(MissingServletRequestParameterException e) {
    String name = e.getParameterName();
    return new ErrorMessage("Please provide a " + name + "!");
  }

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public Student greetStudent(@RequestParam("name") String name, @RequestParam("title") String title) {
    return new Student("Oh, hi there " + name + ", my dear " + title + "!");
  }
}

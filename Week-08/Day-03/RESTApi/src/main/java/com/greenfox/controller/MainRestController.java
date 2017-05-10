package com.greenfox.controller;

import com.greenfox.model.Doubled;
import com.greenfox.model.ErrorMessage;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage someException(Exception e) {
    return new ErrorMessage("Input is not a number");
  }

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubled returnDouble(@RequestParam(value = "input") int input) {
    Doubled instance = new Doubled(input);
    instance.doubleValue();
    return instance;
  }
}

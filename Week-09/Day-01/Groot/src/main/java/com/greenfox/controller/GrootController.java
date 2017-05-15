package com.greenfox.controller;

import com.greenfox.Model.ErrorMessage;
import com.greenfox.Model.Groot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class GrootController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage someException(MissingServletRequestParameterException e) {
    String name = e.getParameterName();
    return new ErrorMessage("I am Groot!");
  }

  @RequestMapping(value = "/groot", method = RequestMethod.GET)
  public Groot getMessage(@RequestParam("message") String message) {
    Groot groot = new Groot(message);
    return groot;
  }
}

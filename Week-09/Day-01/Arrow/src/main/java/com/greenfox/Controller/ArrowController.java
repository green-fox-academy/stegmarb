package com.greenfox.Controller;

import com.greenfox.Model.Arrow;
import com.greenfox.Model.ErrorMessage;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArrowController {

  @RequestMapping(value = "/yondu", method = RequestMethod.GET)
  public Arrow getArrow(@RequestParam("distance") double distance, @RequestParam("time") double time) {
    Arrow arrow = new Arrow(distance, time);
    return arrow;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage someException(MissingServletRequestParameterException e) {
    String name = e.getParameterName();
    return new ErrorMessage("I am Yondu!");
  }
}

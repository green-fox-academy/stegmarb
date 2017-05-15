package com.greenfox.Controller;

import com.greenfox.Model.Arrow;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrowController {

  @RequestMapping(value = "/yondu", method = RequestMethod.GET)
  public Arrow getArrow(@RequestParam("distance") double distance, @RequestParam("time") double time) {
    Arrow arrow = new Arrow(distance, time);
    return arrow;
  }
}

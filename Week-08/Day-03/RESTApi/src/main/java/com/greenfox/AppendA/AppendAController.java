package com.greenfox.AppendA;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {
  @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
  public Appended append(@PathVariable("appendable") String appendable) {
    Appended whatewer = new Appended(appendable);
    whatewer.appendWord();
    return whatewer;
  }

}

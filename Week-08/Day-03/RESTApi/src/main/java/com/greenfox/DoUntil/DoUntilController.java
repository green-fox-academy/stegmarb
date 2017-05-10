package com.greenfox.DoUntil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

  @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
  public GetResult doUntilMethod(@PathVariable("what") String what, @RequestBody DoUntil doUntil ) {

    return new GetResult(what, doUntil.getUntil());
  }
}

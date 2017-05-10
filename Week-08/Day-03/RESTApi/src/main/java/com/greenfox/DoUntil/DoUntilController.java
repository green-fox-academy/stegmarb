package com.greenfox.DoUntil;

import com.greenfox.doubled.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public ErrorMessage errorMessage() {
    return new ErrorMessage("Please provide a number!");
  }

  @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
  public GetResult doUntilMethod(@PathVariable("what") String what, @RequestBody DoUntil doUntil ) {

    return new GetResult(what, doUntil.getUntil());
  }
}

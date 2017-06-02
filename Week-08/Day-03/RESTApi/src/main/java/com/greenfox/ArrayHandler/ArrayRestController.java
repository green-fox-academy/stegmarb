package com.greenfox.ArrayHandler;

import com.greenfox.doubled.ErrorMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ArrayRestController {

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public ErrorMessage errorMessage() {
    return new ErrorMessage("Please provide what to do with the numbers!");
  }


  @PostMapping("/arrays")
  public Result resultOfArray(@RequestBody ArrayHandler arrayHandler) {
    if (arrayHandler.getWhat().equals("sum")) {
      int tempSum = 0;
      for (int i = 0; i < arrayHandler.getNumbers().length; i++) {
        tempSum+=arrayHandler.getNumbers()[i];
      }
      return new IntResult(tempSum);
    } else if (arrayHandler.getWhat().equals("multiply")) {
      int tempSum = 1;
      for (int i = 0; i < arrayHandler.getNumbers().length; i++) {
        tempSum*=arrayHandler.getNumbers()[i];
      }
      return new IntResult(tempSum);
    } else {
      for (int i = 0; i < arrayHandler.getNumbers().length; i++) {
        arrayHandler.getNumbers()[i] = arrayHandler.getNumbers()[i]*2;
      }
      return new ArrayResult(arrayHandler.getNumbers());
    }
  }

}

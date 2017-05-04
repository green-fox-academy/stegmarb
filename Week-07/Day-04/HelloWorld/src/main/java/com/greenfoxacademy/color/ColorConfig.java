package com.greenfoxacademy.color;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfig {

  @Bean
  public BlueColor blueColor() {
    return new BlueColor();
  }

  @Bean
  public RedColor redColor() {
    return new RedColor();
  }
}

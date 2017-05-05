package com.greenfoxacademy.main;

import com.greenfoxacademy.main.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class foxConfiguration {
  @Bean
  public Fox fox() {
    return new Fox("Mr. Green", "salad", "water");
  }
}

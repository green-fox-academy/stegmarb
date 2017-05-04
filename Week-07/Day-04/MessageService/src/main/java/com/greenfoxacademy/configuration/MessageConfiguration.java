package com.greenfoxacademy.configuration;

import com.greenfoxacademy.service.EmailService;
import com.greenfoxacademy.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MessageConfiguration {

  @Bean
  @Primary
  public MessageService emailService() {
    return new EmailService();
  }

  @Bean
  public MessageService tweetService() {
    return new TwitterService();
  }
}

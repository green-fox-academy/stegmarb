package com.greenfoxacademy.configuration;

import com.greenfoxacademy.service.EmailService;
import com.greenfoxacademy.service.MessageProceeder;
import com.greenfoxacademy.service.MessageService;
import com.greenfoxacademy.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MessageConfiguration {

  @Bean
  public MessageProceeder messageProceeder() {
    return new MessageProceeder();
  }

  @Bean(name = "email")
  public EmailService emailService() {
    return new EmailService();
  }

  @Bean(name = "tweet")
  public TwitterService tweetService() {
    return new TwitterService();
  }
}

package com.greenfox.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "todo")
@Getter
@Setter
public class ToDo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;

  public ToDo() {
    isUrgent = false;
    isDone = false;

  }

  public ToDo(String title) {
    this.title = title;
    isUrgent = false;
    isDone = false;
  }

  public boolean isActive() {
    if (isDone == true) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    return title;
  }

  public boolean isDone() {
    return isDone;
  }

  public boolean isUrgent() {
    return isUrgent;
  }
}

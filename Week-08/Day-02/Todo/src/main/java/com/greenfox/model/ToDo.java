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
  private int id;
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

  @Override
  public String toString() {
    return title;
  }
}

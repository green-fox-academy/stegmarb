package com.greenfox.repository;

import com.greenfox.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<ToDo, Long> {
}

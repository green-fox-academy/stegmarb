package com.greenfox.stegmarb.reddit.repository;

import com.greenfox.stegmarb.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}

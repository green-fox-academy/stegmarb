package com.greenfox.stegmarb.reddit.controller;

import com.greenfox.stegmarb.reddit.model.Post;
import com.greenfox.stegmarb.reddit.model.PostService;
import com.greenfox.stegmarb.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

  @Autowired
  PostService postService;

  @RequestMapping("")
  public List<Post> listPosts() {
    return postService.getPosts();
  }

}

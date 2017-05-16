package com.greenfox.stegmarb.reddit.model;

import com.greenfox.stegmarb.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

  @Autowired
  private PostRepository postRepository;
  private List<Post> posts = new ArrayList<>(Arrays.asList(new Post("Dear JavaScript", "http://9gag.com")));

  public List<Post> getPosts() {
    return posts;
  }
}

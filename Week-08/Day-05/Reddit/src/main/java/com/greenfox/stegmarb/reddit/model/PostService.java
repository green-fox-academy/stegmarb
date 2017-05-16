package com.greenfox.stegmarb.reddit.model;

import com.greenfox.stegmarb.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

  @Autowired
  PostRepository postRepository;

  public List<Post> listAllPosts() {
    List<Post> posts = new ArrayList<>();
    postRepository.findAll().forEach(posts::add);
    return posts;
  }

  public Post listOneElement(Long id) {
    return postRepository.findOne(id);
  }

  public void addPost(Post post) {
    postRepository.save(post);
  }

  public PostRepository getPostRepository() {
    return postRepository;
  }
}

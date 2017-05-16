package com.greenfox.stegmarb.reddit.model;

import com.greenfox.stegmarb.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

//  this class could be used for holding a list of objects and store all the methods which are used for controller if not REST app is the case
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

  public void upVote(Long id) {
    postRepository.findOne(id).setScore(postRepository.findOne(id).getScore()+1);
  }

  public void downVote(Long id) {
    postRepository.findOne(id).setScore(postRepository.findOne(id).getScore()-1);
  }

  public PostRepository getPostRepository() {
    return postRepository;
  }
}

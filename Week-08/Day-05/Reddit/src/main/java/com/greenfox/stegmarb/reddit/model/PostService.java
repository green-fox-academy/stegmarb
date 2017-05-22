package com.greenfox.stegmarb.reddit.model;

import com.greenfox.stegmarb.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

  @Autowired
  private PostRepository postRepository;

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
    Post post = postRepository.findOne(id);
    post.setScore(post.getScore()+1);
    postRepository.save(post);
  }

  public void downVote(Long id) {
    Post post = postRepository.findOne(id);
    post.setScore(post.getScore()-1);
    postRepository.save(post);
  }

  public void deletePost(Long id) {
    postRepository.delete(id);
  }

  public PostRepository getPostRepository() {
    return postRepository;
  }
}

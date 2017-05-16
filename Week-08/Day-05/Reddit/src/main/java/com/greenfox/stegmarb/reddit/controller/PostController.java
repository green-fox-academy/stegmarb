package com.greenfox.stegmarb.reddit.controller;

import com.greenfox.stegmarb.reddit.model.Post;
import com.greenfox.stegmarb.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

  @Autowired
  PostRepository postRepository;

  @RequestMapping("")
  public List<Post> listPosts() {
    List<Post> posts = new ArrayList<>();
    postRepository.findAll().forEach(posts::add);
    return posts;
  }

  @RequestMapping("/{id}")
  public Post listOneItem(@PathVariable Long id) {
    return postRepository.findOne(id);
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  public void postOneItem(@RequestBody Post post) {
    postRepository.save(post);
  }

  @RequestMapping(value = "/{id}/upvote", method = RequestMethod.PUT)
  public void upVote(@PathVariable Long id) {
    postRepository.findOne(id).setScore(postRepository.findOne(id).getScore()+1);
  }

  @RequestMapping(value = "/{id}/downvote", method = RequestMethod.PUT)
  public void downVote(@PathVariable Long id) {
    postRepository.findOne(id).setScore(postRepository.findOne(id).getScore()-1);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deletePost(@PathVariable Long id) {
    postRepository.delete(id);
  }
}

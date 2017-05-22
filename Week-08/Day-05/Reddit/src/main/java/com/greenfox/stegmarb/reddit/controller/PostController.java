package com.greenfox.stegmarb.reddit.controller;

import com.greenfox.stegmarb.reddit.model.Post;
import com.greenfox.stegmarb.reddit.model.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@CrossOrigin("*")
public class PostController {

  @Autowired
  private PostService postService;

  @RequestMapping("")
  public List<Post> listPosts() {
    return postService.listAllPosts();
  }

  @RequestMapping("/{id}")
  public Post listOneItem(@PathVariable Long id) {
    return postService.listOneElement(id);
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  public void postOneItem(@RequestBody Post post) {
    postService.addPost(post);
  }

  @RequestMapping(value = "/{id}/upvote", method = RequestMethod.PUT)
  public void upVote(@PathVariable Long id) {
    postService.upVote(id);
  }

  @RequestMapping(value = "/{id}/downvote", method = RequestMethod.PUT)
  public void downVote(@PathVariable Long id) {
    postService.downVote(id);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deletePost(@PathVariable Long id) {
    postService.deletePost(id);
  }
}

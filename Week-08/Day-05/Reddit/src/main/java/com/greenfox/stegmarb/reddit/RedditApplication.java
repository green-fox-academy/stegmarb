package com.greenfox.stegmarb.reddit;

import com.greenfox.stegmarb.reddit.model.Post;
import com.greenfox.stegmarb.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

	@Autowired
	PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(RedditApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		postRepository.save(new Post("Dear JavaScript", "http://9gag.com"));
		postRepository.save(new Post("Crockford", "http://9gag.com"));
	}
}

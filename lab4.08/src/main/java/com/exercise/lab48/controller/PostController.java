package com.exercise.lab48.controller;

import com.exercise.lab48.model.Post;
import com.exercise.lab48.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/post/{id}")
    public Post getPostById(@PathVariable(value="id") Integer idPost) {
        return postService.getPostById(idPost);
    }

    @PostMapping("/post")
    public Post newPost(@RequestBody Post post) {
        return postService.addNewPost(post);
    }

    @PutMapping("/post")
    public Post updatePost(@RequestBody Post post) {
        return postService.updatePost(post);
    }

    @DeleteMapping("/post/")
    public void deletePost(@PathVariable(value="id") Integer idPost) {
        Post post = postService.getPostById(idPost);
        postService.deletePost(post);
    }

}

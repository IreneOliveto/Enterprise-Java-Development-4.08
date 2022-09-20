package com.exercise.lab48.service;

import com.exercise.lab48.model.Post;

public interface PostService {
    Post addNewPost(Post post);
    Post updatePost(Post post);

    void deletePost(Post post);

    Post getPostById(Integer idPost);
}

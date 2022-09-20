package com.exercise.lab48.service;

import com.exercise.lab48.model.Post;
import com.exercise.lab48.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public Post getPostById(Integer idPost) {
        return postRepository.findById(idPost).get();
    }

    @Override
    public Post addNewPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post updatePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public void deletePost(Post post) {
        postRepository.delete(post);
    }


}

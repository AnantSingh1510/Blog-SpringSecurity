package com.testProjects.JWTauth.security.services;

import com.testProjects.JWTauth.models.Post;

import java.util.List;

public interface PostService {
    List<Post> findAllPosts();
    Post getPostById(Long id);
}

package com.testProjects.JWTauth.repositories;

import com.testProjects.JWTauth.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

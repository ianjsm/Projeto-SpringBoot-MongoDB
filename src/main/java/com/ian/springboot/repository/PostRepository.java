package com.ian.springboot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ian.springboot.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

	List<Post> findByTitleContainingIgnoreCase(String text);
}

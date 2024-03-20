package com.ian.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ian.springboot.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}

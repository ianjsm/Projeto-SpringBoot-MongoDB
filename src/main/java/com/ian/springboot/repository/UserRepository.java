package com.ian.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ian.springboot.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
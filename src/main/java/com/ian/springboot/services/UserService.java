package com.ian.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ian.springboot.domain.User;
import com.ian.springboot.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	 
	public List<User> findAll(){
		return repository.findAll();
	}
}
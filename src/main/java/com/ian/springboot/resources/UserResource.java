package com.ian.springboot.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ian.springboot.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User u1 = new User("1", "Mario", "mario@email.com");
		User u2 = new User("2", "Levi", "levi@email.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(u1, u2));
		return ResponseEntity.ok().body(list);
	}
}
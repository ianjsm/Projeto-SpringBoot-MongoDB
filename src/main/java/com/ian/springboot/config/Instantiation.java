package com.ian.springboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ian.springboot.domain.User;
import com.ian.springboot.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepo;

	@Override
	public void run(String... args) throws Exception {
		userRepo.deleteAll();

		User u1 = new User(null, "Tom Levy", "tom@email.com");
		User u2 = new User(null, "Harry Ford", "harry@email.com");
		User u3 = new User(null, "Maria Lindsey", "maria@email.com");

		userRepo.saveAll(Arrays.asList(u1, u2, u3));
	}
}
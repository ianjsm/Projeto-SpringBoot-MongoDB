package com.ian.springboot.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ian.springboot.domain.Post;
import com.ian.springboot.domain.User;
import com.ian.springboot.dto.AuthorDTO;
import com.ian.springboot.repository.PostRepository;
import com.ian.springboot.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		userRepository.deleteAll();
		postRepository.deleteAll();

		User u1 = new User(null, "Tom Levy", "tom@email.com");
		User u2 = new User(null, "Harry Ford", "harry@email.com");
		User u3 = new User(null, "Maria Lindsey", "maria@email.com");

		userRepository.saveAll(Arrays.asList(u1, u2, u3));

		Post p1 = new Post(null, sdf.parse("20/03/2024"), "Partiu viagem", "Indo viajar para SP!", new AuthorDTO(u1));
		Post p2 = new Post(null, sdf.parse("15/11/2023"), "Final da Liberta", "Em Montevideu", new AuthorDTO(u1));

		postRepository.saveAll(Arrays.asList(p1, p2));
	}
}
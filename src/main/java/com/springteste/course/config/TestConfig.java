package com.springteste.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springteste.course.entities.User;
import com.springteste.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Roberto", "roberto@gmail.com", "988888888", "1234567");
		User u2 = new User(null, "Roberta", "roberta@gmail.com", "977777777", "1234567");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
	
}

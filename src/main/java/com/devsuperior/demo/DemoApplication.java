package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	PasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ENCODER = " + passwordEncoder.encode("123456"));
		boolean result = passwordEncoder.matches("123456","$2a$10$ee6Ji5PJsjBoTqoBRnSl3OKoELf2MMQKTGqB9Grp.RShdetayoVnK");
		System.out.println(result);
		
		
	}

}

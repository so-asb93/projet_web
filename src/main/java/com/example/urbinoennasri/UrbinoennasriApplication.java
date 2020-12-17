package com.example.urbinoennasri;


import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class UrbinoennasriApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrbinoennasriApplication.class, args);
	}

}

package com.springboot.firstwebapplication1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Firstwebapplication1Application 
{

	public static void main(String[] args)
	{
		SpringApplication.run(Firstwebapplication1Application.class, args);
	}

}

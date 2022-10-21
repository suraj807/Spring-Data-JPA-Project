package com.biryaniwala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MbabiryaniwalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbabiryaniwalaApplication.class, args);
	}

}

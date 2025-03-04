package com.example.healthcareapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  // Enables automatic auditing (timestamps)
@SpringBootApplication
public class HealthcareappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareappApplication.class, args);
	}

}

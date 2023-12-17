package com.example.architecureexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.example.*")
public class ArchitecureExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchitecureExampleApplication.class, args);
	}

}

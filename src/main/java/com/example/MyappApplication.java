package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyappApplication {
	@Value("${message:tamajit}")
	private String msg; 

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}
	
	@GetMapping("/message")
	public String message() {
		return msg;
	}
	
	@GetMapping("/health")
	public String health() {
		return "running";
	}

}

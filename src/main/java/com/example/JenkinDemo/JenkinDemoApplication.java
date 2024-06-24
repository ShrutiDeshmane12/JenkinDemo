package com.example.JenkinDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinDemoApplication {
	
	@GetMapping
	public String getmessage()
	{
		return "Hello .......";
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinDemoApplication.class, args);
	}

}

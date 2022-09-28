package com.peppermint100.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/hello")
	public String helloController() {
		return "Hello " + ZonedDateTime.now();
	}

	@GetMapping("/hello/world")
	public String worldController() {
		return "Hello World " + ZonedDateTime.now();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

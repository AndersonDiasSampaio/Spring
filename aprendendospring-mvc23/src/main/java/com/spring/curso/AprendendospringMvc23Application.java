package com.spring.curso;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AprendendospringMvc23Application {
	
/*	@Value("${application.dias}")
	private String Name;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return this.Name;
	}*/
	public static void main(String[] args) {
		SpringApplication.run(AprendendospringMvc23Application.class, args);
	}

}

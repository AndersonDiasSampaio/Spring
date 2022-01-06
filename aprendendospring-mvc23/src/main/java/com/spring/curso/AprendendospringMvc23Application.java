package com.spring.curso;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.curso.domain.Cliente;
import com.spring.curso.repository.Clientes;

@SpringBootApplication
public class AprendendospringMvc23Application {
	
/*	@Value("${application.dias}")
	private String Name;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return this.Name;
	}*/
	
	@Bean
	public CommandLineRunner init (@Autowired Clientes clientes) {
		return args ->{
			Cliente cliente = new Cliente();
			cliente.setNome("anderson");
			clientes.Salvar(cliente);
			
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AprendendospringMvc23Application.class, args);
	}
asas
}

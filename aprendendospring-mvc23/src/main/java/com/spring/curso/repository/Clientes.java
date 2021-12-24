package com.spring.curso.repository;

import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.*;

import com.spring.curso.domain.Cliente;

@Repository
public class Clientes {
	@Autowired
	private JdbcTemplate jdbctemplate;
	private static String INSERT = "insert into cliente (nome) values (?)";
	public Cliente  Salvar(Cliente cliente) {
		
	jdbctemplate.update(INSERT, new Object[] {cliente.getNome()});
	return cliente;
	}

}

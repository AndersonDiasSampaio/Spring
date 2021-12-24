package com.spring.curso.domain;

import java.math.BigDecimal;

public class Produto {
private Integer id;
private String nome;
private BigDecimal preço;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public BigDecimal getPreço() {
	return preço;
}
public void setPreço(BigDecimal preço) {
	this.preço = preço;
}

}

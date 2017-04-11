package com.vinicius.cursojava.aula44;

public abstract class Animal {

	private String nome;
	
	public abstract void emitirSon();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

package com.vinicius.cursojava.aula43.labs.Exer03;

public class Mamifero extends Animal{

	private String alimento;
	
	public Mamifero(){
		this.setCor("Castanho");
		this.alimento = "Mel";
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
}

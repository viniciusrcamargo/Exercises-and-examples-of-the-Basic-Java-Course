package com.vinicius.cursojava.aula43.labs.Exer03;

public class Animal {

	private String Nome;
	private double comprimento;
	private int patas;
	private String cor;
	private String ambientes;
	private double velocidade;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbientes() {
		return ambientes;
	}
	public void setAmbientes(String ambientes) {
		this.ambientes = ambientes;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public String toString() {
		return "Animal [Nome=" + Nome + ", comprimento=" + comprimento
				+ ", patas=" + patas + ", cor=" + cor + ", ambientes="
				+ ambientes + ", velocidade=" + velocidade + "]";
	}
	
	
	
}

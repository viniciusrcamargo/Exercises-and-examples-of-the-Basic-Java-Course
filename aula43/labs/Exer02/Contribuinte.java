package com.vinicius.cursojava.aula43.labs.Exer02;

public abstract class Contribuinte {

	private String nomeContribuinte;
	private double rendaBruta;
	
	
	public String getNomeContribuinte() {
		return nomeContribuinte;
	}
	public void setNomeContribuinte(String nomeContribuinte) {
		this.nomeContribuinte = nomeContribuinte;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public abstract double calcularImposto();
	@Override
	public String toString() {
		return "Contribuinte [nomeContribuinte=" + nomeContribuinte
				+ ", rendaBruta=" + rendaBruta + "]";
	}
	
	
	

	
}

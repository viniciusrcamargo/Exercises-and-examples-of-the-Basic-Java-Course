package com.vinicius.cursojava.aula31;

public class Carro {//class Carro (modo default s� � visivel dentro do pacote)
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;//default � enxergado dentro do pacote
	private double consumoCombustivel;//s� a classe enxerga
	
	public void exibirAutonomia(){//boa pr�tica de programa��o java � o nome do m�todo sempre ser um verbo
		System.out.println("A autonomia do carro � " + this.capCombustivel * this.consumoCombustivel + " km");
	}
	
	public double obterAutonomia(){
		System.out.println("M�todo obterAutonomia foi chamado");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKmPorConsumoCombustivel(double km){
		return km/this.capCombustivel;
	}
	
	public double calcularCombustivel(double km){
		return this.divideKmPorConsumoCombustivel(km);
	}
}

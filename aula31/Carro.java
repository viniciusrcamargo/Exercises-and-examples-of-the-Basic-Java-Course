package com.vinicius.cursojava.aula31;

public class Carro {//class Carro (modo default só é visivel dentro do pacote)
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;//default é enxergado dentro do pacote
	private double consumoCombustivel;//só a classe enxerga
	
	public void exibirAutonomia(){//boa prática de programação java é o nome do método sempre ser um verbo
		System.out.println("A autonomia do carro é " + this.capCombustivel * this.consumoCombustivel + " km");
	}
	
	public double obterAutonomia(){
		System.out.println("Método obterAutonomia foi chamado");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKmPorConsumoCombustivel(double km){
		return km/this.capCombustivel;
	}
	
	public double calcularCombustivel(double km){
		return this.divideKmPorConsumoCombustivel(km);
	}
}

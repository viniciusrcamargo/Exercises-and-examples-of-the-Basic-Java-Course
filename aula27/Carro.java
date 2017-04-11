package com.vinicius.cursojava.aula27;

public class Carro {
	String marca;
	String modelo;
	byte numPassageiroa;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia(){//boa prática de programação java é o nome do método sempre ser um verbo
		System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + " km");
	}
	
	double obterAutonomia(){
		System.out.println("Método obterAutonomia foi chamado");
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km){
		
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
}

package com.vinicius.cursojava.aula25;

public class Carro {

	String marca;
	String modelo;
	byte numPassageiroa;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia(){//boa prática de programação java é o nome do método sempre ser um verbo
		System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + " km");
	}
}

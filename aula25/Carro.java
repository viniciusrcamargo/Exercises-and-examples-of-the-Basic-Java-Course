package com.vinicius.cursojava.aula25;

public class Carro {

	String marca;
	String modelo;
	byte numPassageiroa;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia(){//boa pr�tica de programa��o java � o nome do m�todo sempre ser um verbo
		System.out.println("A autonomia do carro � " + capCombustivel * consumoCombustivel + " km");
	}
}

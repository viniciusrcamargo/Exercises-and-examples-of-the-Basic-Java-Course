package com.vinicius.cursojava.aula27;

public class Carro {
	String marca;
	String modelo;
	byte numPassageiroa;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia(){//boa pr�tica de programa��o java � o nome do m�todo sempre ser um verbo
		System.out.println("A autonomia do carro � " + capCombustivel * consumoCombustivel + " km");
	}
	
	double obterAutonomia(){
		System.out.println("M�todo obterAutonomia foi chamado");
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km){
		
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
}

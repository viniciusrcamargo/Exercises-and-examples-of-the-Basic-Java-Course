package com.vinicius.cursojava.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	Carro(){
		System.out.println("A Classe Carro foi instanciada");
		numPassageiros = 4;
	}
	
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){//a variavel de parametro tem que ser diferente pois esta no mesmo escopo
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}
	
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


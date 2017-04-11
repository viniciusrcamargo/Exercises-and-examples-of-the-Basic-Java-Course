package com.vinicius.cursojava.aula26;

import com.vinicius.cursojava.aula26.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiroa = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();//nome de m�todo sempre come�a com verbo

		double autonomia = van.obterAutonomia();
		System.out.println("A Autonomia do carro � = " + autonomia);
		System.out.println("A Autonomia do carro � = " + van.obterAutonomia());
	}

}

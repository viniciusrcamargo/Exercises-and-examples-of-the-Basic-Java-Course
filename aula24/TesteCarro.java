package com.vinicius.cursojava.aula24;

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
		
		Carro fusca = new Carro();
		
		fusca.marca = "Volksvagem";
		fusca.modelo = "Fusca";
		fusca.numPassageiroa = 5;
		fusca.capCombustivel = 50;
		fusca.consumoCombustivel = 1.5;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		

	}

}

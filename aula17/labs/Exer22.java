package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantTotal = 0;
		double acumValor = 0, mediaValor = 0;
		
		System.out.println("Informe a quantidade de CD's da coleção ou 0 para sair");
		int quantCd = scan.nextInt();
		
		while(quantCd > 0){
			quantTotal += quantCd;
			System.out.println("Informe o valor de cada CD");
			double valorCd = scan.nextDouble();
			acumValor += (valorCd * quantCd);
	
			System.out.println("Informe a quantidade de CD's da coleção ou 0 para sair");
			quantCd = scan.nextInt();
		}
		mediaValor = (acumValor / quantTotal);
		System.out.println("Valor total gasto pelo colecionador R$ " + acumValor);
		System.out.println("Valor médio gasto em cada CD R$ " + mediaValor);
	}

}

package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double [] a = new double[20];
		double cotacao;
	
		System.out.println("Informe a cota��o do d�lar");
		cotacao = scan.nextDouble();
		
		for(int i = 0; i < 20; i++){
			a[i] = cotacao * (i+1);
			System.out.println("Cota��o do d�lar U$ " + a[i]);
		}

	}

}

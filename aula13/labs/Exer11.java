package com.vinicius.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro número inteiro");
		int n1 = scan.nextInt();
		System.out.println("Informe o segundo número inteiro");
		int n2 = scan.nextInt();
		System.out.println("Informe um número real");
		double n3 = scan.nextDouble();
		
		double resultado1 = (n1 * 2) * (n2 / 2);
		double resultado2 = (n1 * 3) + n3;
		double resultado3 = Math.pow(n3, 3);
		
		System.out.println("O primeiro resultado " + resultado1);
		System.out.println("O segundo resultado " + resultado2);
		System.out.println("O terceiro resultado " + resultado3);
		

	}

}

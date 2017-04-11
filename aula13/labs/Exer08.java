package com.vinicius.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor hora");
		double valorHora = scan.nextDouble();
		System.out.println("Infome a quantidade de horas/mes trabalhadas");
		double qtdeHora = scan.nextDouble();
		
		System.out.println("O salário mensal é " + (valorHora * qtdeHora));

	}

}

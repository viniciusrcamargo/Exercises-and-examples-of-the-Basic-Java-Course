package com.vinicius.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor hora");
		double valorHora = scan.nextDouble();
		System.out.println("Infome a quantidade de horas/mes trabalhadas");
		double qtdeHora = scan.nextDouble();

		double salarioBruto = valorHora * qtdeHora;
		double inss = (salarioBruto /100) * 8;
		double sindicato = (salarioBruto / 100) * 8;
		double imposto = (salarioBruto/ 100) * 11;
		double totalDescontos = inss + sindicato + imposto;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("O salário mensal é " + salarioBruto);
		System.out.println("Inss: " + inss);
		System.out.println("Sindicato " + sindicato);
		System.out.println("Imposto " + imposto);
		System.out.println("O total de descontos " + totalDescontos);
		System.out.println("O salário liquido é " + salarioLiquido);
	}

}

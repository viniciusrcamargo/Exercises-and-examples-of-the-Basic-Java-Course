package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String conceito = null, situacao = null;
		
		System.out.println("Informe nota 1");
		double nota1 = scan.nextDouble();
		System.out.println("Informe nota 2");
		double nota2 = scan.nextDouble();
	
		double media = (nota1 + nota2)/2;
		
		if((media > 0) && (media < 4)){
			conceito = "E";
			situacao = "Reprovado";
		}else if((media >= 4) && (media < 6)){
			conceito = "D";
			situacao = "Reprovado";
		}else if((media >= 6) && (media < 7.5)){
			conceito = "C";
			situacao = "Aprovado";
		}else if((media >= 7.5) && (media < 9)){
			conceito = "B";
			situacao = "Aprovado";
		}else if((media >= 9) && (media <= 10)){
			conceito = "A";
			situacao = "Aprovado";
		}
		
		System.out.println("Nota 1 = " + nota1);
		System.out.println("Nota 2 = " + nota2);
		System.out.println("Média = " + media);
		System.out.println("Conceito = " + conceito);
		System.out.println("Situação = " + situacao);
		

	}

}

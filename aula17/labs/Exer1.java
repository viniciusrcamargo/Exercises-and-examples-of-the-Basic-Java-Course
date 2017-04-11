package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe uma nota");
		double nota = scan.nextDouble();
		
		while((nota < 0) || (nota > 10)){ 
			System.out.println("A nota deve estar entre 0 e 10");
			System.out.println("Informe uma nota");
			nota = scan.nextDouble();
	}
		System.out.println("Nota válida digitada = " + nota);
	}
}

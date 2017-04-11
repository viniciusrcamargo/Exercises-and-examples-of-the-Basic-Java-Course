package com.vinicius.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota");
		double nota1 = scan.nextDouble();
		System.out.println("Entre com a segunda nota");
		double nota2 = scan.nextDouble();
		System.out.println("Entre com a terceira nota");
		double nota3 = scan.nextDouble();
		System.out.println("A média é: " + (nota1+nota2+nota3)/3);

	}

}

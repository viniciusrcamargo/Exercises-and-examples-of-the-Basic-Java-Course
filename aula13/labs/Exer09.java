package com.vinicius.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a temperatura em Farenheint");
		double f = scan.nextDouble();
		
		double c = (5*(f-32)/9);
		System.out.println("A temperatura em Celsius é " + c);
	}

}

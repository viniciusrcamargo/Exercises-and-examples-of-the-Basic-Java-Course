package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double acumul = 0;
		System.out.println("Informe número 1");
		int num1 = scan.nextInt();
		System.out.println("Informe número 2");
		int num2 = scan.nextInt();
		
		for(int i = num1; i<= num2; i++){
			System.out.println(i);
			acumul = acumul + i;
		}
		System.out.println("A soma dos números é " + acumul);
	}
	
}

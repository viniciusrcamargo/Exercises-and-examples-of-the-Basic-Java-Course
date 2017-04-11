package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		double result = 0;

		System.out.println("Informe a base da potência");
		int base = scan.nextInt();
		System.out.println("Informe o expoente da potência");
		int exp = scan.nextInt();
		result = base;
		for(int i = 1; i < exp; i++){
			result *= base;
		}
		System.out.println("A potência é = " + result);
	}

}

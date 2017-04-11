package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double result = 0;
		
		System.out.println("Informe o número para a tabuada");
		int num = scan.nextInt();
		for(int i = 1; i <= 10; i++){
			System.out.println(num + " x " + i + " = " + num*i);
		}

	}

}

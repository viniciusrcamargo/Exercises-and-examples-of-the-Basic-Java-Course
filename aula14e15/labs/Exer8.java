package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor do primeiro produto");
		double val1 = scan.nextDouble();
		System.out.println("Entre com o valor do segundo produto");
		double val2 = scan.nextDouble();
		System.out.println("Entre com o valor do terceiro produto");
		double val3 = scan.nextDouble();
		
		if((val1 < val2) && (val1 < val3)){
			System.out.println("Compre o primeiro produto");
		}else if((val2 < val1) && (val2 < val3)){
			System.out.println("Compre o segundo produto");
		}else if((val3 < val1) && (val3 < val2)){
			System.out.println("Compre o terceiro produto");
		}
	}

}

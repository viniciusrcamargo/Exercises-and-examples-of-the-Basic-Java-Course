package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
		double num = scan.nextDouble();
		
		if(num % 2 == 0){
			System.out.println("N�mero par");
		}else{
			System.out.println("N�mero impar");
		}

	}

}

package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = scan.nextInt();
		
		if(num > 0){
			System.out.println("Positivo");
		}else{
			System.out.println("Negativo");
		}

	}

}

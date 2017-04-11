package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] a = new int[15];
		int [] b = new int[15];
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Digite o " + (i+1) + " valor para o vetor A");
			a[i] = scan.nextInt();
			b[i] = a[i] * a[i];
		}
		for(int i = 0; i < b.length; i++){
			System.out.println("O valor " + (i+1) + " do vetor A ao quadrado é igual a = " + b[i]);
		}

	}

}

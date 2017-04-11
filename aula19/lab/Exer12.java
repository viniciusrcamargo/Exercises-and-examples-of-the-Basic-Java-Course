package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] a = new int[10];
		int soma = 0;
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Insira o valor " + (i+1) + " do vetor");
			a[i] = scan.nextInt();
			soma += a[i];
		}
		System.out.println("A soma dos números do vetor é " + soma);

	}

}

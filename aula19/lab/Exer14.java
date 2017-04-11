package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] a = new int[10];
		double soma = 0, impar = 0;
		double media = 0;
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Insira o valor " + (i+1) + " do vetor");
			a[i] = scan.nextInt();
			if(a[i] % 2 != 0){
			soma += a[i];
			impar++;
				}
			}
		media = (soma / impar);
		System.out.println("A média aritimética dos números impares do vetor é " + media);

	}

}

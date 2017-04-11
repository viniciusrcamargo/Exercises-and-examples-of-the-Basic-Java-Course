package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] a = new int[10];
		int soma = 0;
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Insira o valor " + (i+1) + " do vetor");
			a[i] = scan.nextInt();
			if((a[i] % 5 == 0) || (a[i] == 5)){
			soma += a[i];}
		}
		System.out.println("A soma dos números divisiveis por 5 é " + soma);

	}

}

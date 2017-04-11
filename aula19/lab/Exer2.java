package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] a = new int[8];
		int [] b = new int[8];
		
		for(int i = 0; i < a.length; i++){
		System.out.println("Digite o " + (i+1) + "valor para o vetor A");
		a[i] = scan.nextInt();	
		b[i] = (a[i]*2);
		}
		for(int j = 0; j < b.length; j++){
			System.out.println("O valor " + j + "do vetor A multiplicado por 2 é = " + b[j]);
		}
	}

}

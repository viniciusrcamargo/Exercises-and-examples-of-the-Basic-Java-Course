package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] a = new int[10];
		int [] b = new int[10];
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Digite o " + (i+1) + " valor para o vetor A");
			a[i] = scan.nextInt();
			b[i] = (a[i] * i);
		}
		for(int i = 0; i < b.length; i++){
			System.out.println("O valor " + (i+1) + " do vetor A multiplicado por " + i +" = " + b[i]);
		}

	}

}

package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] a = new int[10];
		int [] b = new int[10];
		int [] c = new int[10];
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Digite o " + (i+1) + " valor para o vetor A");
			a[i] = scan.nextInt();
		}
		for(int i = 0; i < b.length; i++){
			System.out.println("Digite o " + (i+1) + " valor para o vetor B");
			b[i] = scan.nextInt();
			c[i] = a[i] * b[i];
		}
		for(int i = 0; i < c.length; i++){
			System.out.println("A multiplicação do valor " + (i+1) + " dos vetores A e B é = " + c[i]);
		}

	}

}

package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] a = new int[15];
		double [] b = new double[15];
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Digite o " + (i+1) + " valor para o vetor A");
			a[i] = scan.nextInt();
			b[i] = Math.sqrt(a[i]);
		}
		for(int i = 0; i < b.length; i++){
			System.out.println("A raiz quadrada do número " + (i+1) + " do vetor A é igual a = " + b[i]);
		}

	}

}

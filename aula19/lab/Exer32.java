package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[5];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Informe o " + (i+1) + " número para o cálculo da tabuada");
			vetorA[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("Tabuada dos números digitados: ");
		for(int i = 0; i < vetorA.length; i++){
			for(int j = 0; j < 11; j++){
				System.out.println(j + " x " + vetorA[i] + " = " + (j * vetorA[i]));
			}
			System.out.println();
		}
		

	}

}

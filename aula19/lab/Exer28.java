package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[10];
		int [] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Insira o " + (i+1) + " nº do vetor A");
			vetorA[i] = scan.nextInt();
			
			vetorB[vetorA.length - i - 1] = vetorA[i];//valor 10 - 0 - 1 = 9 e com o i incrementando sempre insere na ultima posição
		}
		System.out.print("Valores do vetor A = ");
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i]+ " ");
		}
		System.out.println();
		System.out.print("Valores do vetor B = ");
		for(int i = 0; i < vetorB.length; i++){
			System.out.print(vetorB[i]+ " ");
		}
	}

}

package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[10];
		int [] vetorB = new int[vetorA.length];
		int [] vetorC = new int[vetorA.length * 2];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Insira o valor para o vetor A da posição "+ (i+1));
			vetorA[i] = scan.nextInt();	
			vetorC[i] = vetorA[i];
		}
		for(int i = 0; i < vetorB.length; i++){
			System.out.println("Insira o valor para o vetor B da posição "+ (i+1));
			vetorB[i] = scan.nextInt();
			vetorC[vetorA.length + i] = vetorB[i];
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
		System.out.println();
		System.out.print("Valores do vetor c = ");
		for(int i = 0; i < vetorC.length; i++){
			System.out.print(vetorC[i]+ " ");
		}

	}

}

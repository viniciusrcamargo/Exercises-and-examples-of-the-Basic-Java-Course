package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [] vetorA = new int[15];
		int [] vetorB = new int[15];

		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Informe um valor para a posição " + i + " do vetor");
			vetorA[i] = scan.nextInt();
		}
		System.out.println();
		for(int i = 0; i < vetorA.length; i++){
			vetorB[i] = 1;//opcional
			for(int j = 1; j < vetorA.length; j++){
			   vetorB[i] *= j; 
			}
		}
		System.out.println();
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++){
				System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++){
				System.out.print(vetorB[i] + " ");
		}
	}

}


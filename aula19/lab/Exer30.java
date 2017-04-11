package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[20];
		int [] vetorB = new int[vetorA.length];
		int [] vetorC = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Insira o valor para o vetor A da posição "+ (i+1));
			vetorA[i] = scan.nextInt();
		}
		
		int posB = 0;
		int posC = 0;
		
		for(int i = 0; i < vetorA.length; i++){
			if(vetorA[i] % 2 == 0){
				vetorB[posB] = vetorA[i];
				posB++;
			}else{
				vetorC[posC] = vetorA[i];
				posC++;
			}
		}
		System.out.print("Valores do vetor A = ");
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorA[i]+ " ");
		}
		System.out.println();
		System.out.print("Valores do vetor B = ");
		for(int i = 0; i < vetorB.length; i++){
			if(vetorB[i] <= 0){
				break;
			}
			System.out.print(vetorB[i]+ " ");
		}
		System.out.println();
		System.out.print("Valores do vetor c = ");
		for(int i = 0; i < vetorC.length; i++){
			if(vetorC[i] <= 0){
				break;
			}
			System.out.print(vetorC[i]+ " ");
		}

	}

}

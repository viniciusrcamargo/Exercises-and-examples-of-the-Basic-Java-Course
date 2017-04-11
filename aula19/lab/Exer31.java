package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[20];
		int [] vetorB = new int[vetorA.length];
		int [] vetorC = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Informe um valor para a " + (i+1) + " posição do vetor");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 2 == 0){
				vetorB[i] = vetorA[i];
			}else{
				vetorC[i] = vetorA[i];
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
			if(vetorB[i] != 0){
				System.out.print(vetorB[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Vetor C = ");
		for(int i = 0; i < vetorC.length; i++){
			if(vetorC[i] != 0){
				System.out.print(vetorC[i] + " ");
			}
		}
	}

}

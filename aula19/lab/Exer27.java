package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[10];
		char [] vetorB = new char[10];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Entre com um valor " + (i+1) + " para A ");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] < 7){
				vetorB[i] = 'a';
			}
			if(vetorA[i] == 7){
				vetorB[i] = 'b';
			}
			if(vetorA[i] > 7){
				vetorB[i] = 'c';
			}
			if(vetorA[i] == 10){
				vetorB[i] = 'd';
			}
			if(vetorA[i] > 10){
				vetorB[i] = 'e';
			}
		}
		
		for(int i = 0; i < vetorB.length; i++){
			System.out.println("Valor do vetor B = " + vetorB[i]);
		}

	}

}

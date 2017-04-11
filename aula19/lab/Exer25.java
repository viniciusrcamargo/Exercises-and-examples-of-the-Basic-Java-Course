package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [] vetorA = new int[10];
		int [] vetorB = new int[10];

		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Informe o " + (i+1) + " valor para o vetor A");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 ==0){
				vetorB[i] = 1;
			}else{
				vetorB[i] = 0;
			}
		}
		
		for(int i = 0; i < vetorB.length; i++){
			System.out.println("Valor " + (i+1) + " do vetor B = " + vetorB[i] );
		}
	}

}

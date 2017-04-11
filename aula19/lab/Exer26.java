package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[10];
		int [] vetorB = new int[10];
		int [] vetorC = new int[10];

		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Entre com um valor " + (i+1) + " para A ");
			vetorA[i] = scan.nextInt(); //(int)Math.round(Math.random() * 100);
			System.out.println("Entre com um valor " + (i+1) + " para B ");
			vetorB[i] = scan.nextInt();//(int)Math.round(Math.random() * 100);
			if(vetorA[i] > vetorB[i]){
				vetorC[i] = 1;
			}
			if(vetorA[i] == vetorB[i]){
				vetorC[i] = 0;
			}
			if(vetorA[i] < vetorB[i]){
				vetorC[i] = -1;
			}
		}
		
		for(int i = 0; i < vetorC.length; i++){
			System.out.println("Valor " + (i+1) + " do vetor C = " + vetorC[i]);
		}

	}

}

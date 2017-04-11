package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [] a = new int[10];
		boolean par = true;
		
		for(int i = 0; i < 10; i++){
			System.out.println("Informe o valor " + (i+1) + " para o vetor A");
			a[i] = scan.nextInt();
			if(a[i] % 2 != 0){
				par = false;
				System.out.println("Número impar digitado!");
				break;
			}
		}
		if(par == true){
		for(int i = 0; i<10; i++){
			System.out.println("Número " + (i+1) + " do vetor = " + a[i]);
		} 
		}
		

	}

}

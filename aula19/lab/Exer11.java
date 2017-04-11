package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] a = new int[10];
		int par = 0;
		for(int i = 0; i < a.length; i++){
			System.out.println("Insira o valor " + (i+1) + " do vetor");
			a[i] = scan.nextInt();
			if(a[i] % 2 == 0){
				par++;
			}
		}
		System.out.println("A quantidade de números par é " + par);
	}

}

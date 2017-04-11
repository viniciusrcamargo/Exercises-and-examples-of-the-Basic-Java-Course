package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		int [] a = new int[10];
		double impar = 0, par = 0;
		double percentualI = 0, percentualP = 0;
		
		for(i = 0; i < a.length; i++){
			System.out.println("Insira o valor " + (i+1) + " do vetor");
			a[i] = scan.nextInt();
			if(a[i] % 2 == 0){
				par++;
				}else{
					impar++;
				}
			}
		percentualI = (impar * 100) / i;
		percentualP = (par * 100) / i;
		System.out.println("A porcentagem de números impar é " + percentualI);
		System.out.println("A porcentagem de números par é " + percentualP);
	}

}

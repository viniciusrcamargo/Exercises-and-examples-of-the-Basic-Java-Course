package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, somaMenor = 0, igual = 0, contM = 0;
		int [] a = new int[10];
		double somaMaior = 0, media = 0;
		
		
		for(i = 0; i < a.length; i++){
			System.out.println("Insira o valor " + (i+1) + " do vetor");
			a[i] = scan.nextInt();
			if(a[i] < 15){
				somaMenor += a[i];
			}else if(a[i] == 15){
				igual++;
			}else if(a[i] > 15){
				somaMaior += a[i];
				contM++;
			}
			}
		media = somaMaior / contM;
		System.out.println("A soma dos números inferior a 15 é " + somaMenor);
		System.out.println("A quantidade de números iguais a é " + igual);
		System.out.println("A média dos números maior a 15 é " + media);

	}

}

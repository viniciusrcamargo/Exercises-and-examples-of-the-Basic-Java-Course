package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [] a = new int[10];
		
		for(int i = 0; i < 10; i++){
			System.out.println("Informe o valor " + (i+1) + " para o vetor A");
			a[i] = scan.nextInt();
			}
		boolean palindromo = true;
		for(int i = 0; i < a.length; i++){
			if(a[i] != a[a.length - 1 - i]){
				palindromo = false;
				break;
			}
		}
		for(int i = 0; i < a.length; i++){
			System.out.println("Número da posição " + (i+1) + " do vetor A = " + a[i]);
		}
		if(palindromo){
			System.out.println("Palindromo!");
		}else{
			System.out.println("Não é palindromo");
		}
	}

}

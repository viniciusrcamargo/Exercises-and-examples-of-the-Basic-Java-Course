package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [] a = new int[10];
		boolean primo = true;
		String msg = "";
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Informe um número para a " + (i+1) + " posição do vetor");
			a[i] = scan.nextInt();
			
		}
		
		for(int i = 0; i < a.length; i++){
			
			for(int j = 2; j < a[i]; j++){
			if(a[i] % j == 0){
				primo = false;
				break;
				}
			}
		if(primo){
			msg = " primo";
		}else{
			msg = " não é primo";
		}
		System.out.println(a[i] + msg);
	  }
	}
}

package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean primo = true;
		
		System.out.println("Informe um n�mero");
		int num = scan.nextInt();
		
		for(int i = 2; i < num; i++){
			if(num % i == 0){
			System.out.println("N�o � primo");
			primo = false;
			//break;
			}
		}
		if(primo){
			System.out.println("� n�mero primo");
		}

	}

}

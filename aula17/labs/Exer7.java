package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int maior = Integer.MIN_VALUE;
		for(int i = 1; i <= 5; i++){
			System.out.println("Informe o primeiro número");
			num = scan.nextInt();
			
			if(num > maior){
				maior = num;
			}
		}
		System.out.println("O maior número foi = " + maior);

	}

}

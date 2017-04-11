package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [] a = new int[10];
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Informe um valor para a posição " + i + " do vetor");
			a[i] = scan.nextInt();
		}
		System.out.println();
		
		for(int i = 0; i < a.length; i++){
			System.out.print("Divisores dos números do vetor = ");
				for(int j = 1; j < a[i]; j++){
					if(a[i] % j == 0){
						System.out.println(j + " é divisor");
					}
				}
				System.out.println();
		}

	}

}

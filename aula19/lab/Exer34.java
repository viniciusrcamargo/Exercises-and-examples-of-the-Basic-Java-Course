package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [] a = new int[10];
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Informe um valor para a posição " + i + " do vetor");
			a[i] = scan.nextInt();
		}
		System.out.println();
		System.out.print("Números do vetor = ");
		for(int i = 0; i < a.length; i++){
				System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("Números pares = ");
		for(int i = 0; i < a.length; i++){
			if(a[i] % 2 == 0){
				System.out.print(a[i] + " ");
			}
		}

	}

}

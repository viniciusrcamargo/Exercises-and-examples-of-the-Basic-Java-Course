package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade = 0;
		int [] a = new int[10];
		
		
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Informe a idade da pessoa");
			a[i] = scan.nextInt();
			if(a[i] > 35){
				idade++;
			}
			}
		System.out.println("A quantidade de pessoas com idade maior que 35 é " + idade);

	}

}

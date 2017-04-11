package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número para o calculo do fatorial");
		int num = scan.nextInt();
		int fat = 1;
		
		for(int i = num; i > 0; i--){
		fat *= i;
		System.out.println(i);
		}
		System.out.println("Resultado " + fat + "!");
		System.out.println("O fatorial de " + num + " é = "+ fat + "!" );

	}

}

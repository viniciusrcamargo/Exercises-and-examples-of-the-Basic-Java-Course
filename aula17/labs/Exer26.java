package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número para o calculo do fatorial");
		int num = scan.nextInt();
		int fat = 1;
		System.out.println("Fatorial de " + num);
		System.out.print(num + "! = ");
		for(int i = num; i > 1; i--){
		fat *= i;
		System.out.print(i + " . ");
		}
		
		System.out.print(" 1 = " + fat);


	}

}

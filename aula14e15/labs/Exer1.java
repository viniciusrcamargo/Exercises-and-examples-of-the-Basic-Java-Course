package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número");
		int num1 = scan.nextInt();
		System.out.println("Informe outro número");
		int num2 = scan.nextInt();
		
		if(num1 > num2){
			System.out.println("Primeiro número é maior: " + num1);
		}else if (num2 > num1){
			System.out.println("Segundo número é maior: " + num2);
		}

	}

}

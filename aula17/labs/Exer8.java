package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int soma = 0;
		int media = 0;
		for(int i = 0; i < 5;  i++){
		System.out.println("Entre com um número");
		num = scan.nextInt();
		soma += num;
		media = soma / 5;
		}
		System.out.println("A soma dos números é = " + soma);
		System.out.println("A média é = " + media);
	}

}

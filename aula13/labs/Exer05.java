package com.vinicius.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade em metros: ");
		int metros = scan.nextInt();
		metros = metros * 100;
		System.out.println("A quantidade em centímetros é: " + metros);

	}

}

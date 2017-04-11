package com.vinicius.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o raio do circulo");
		double raio = scan.nextDouble();
		//calculo da área igual a pi * raio ao quadrado
		//Math contem varias classes com funções matemáticas
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("A área do círculo é: " + area);
	}

}

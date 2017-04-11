package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe uma temperatura ou 0 para sair");
		double temp = scan.nextDouble();
		double acum = 0; 
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		int cont = 0;
		while(temp > 0){
			if(temp > maior){
				maior = temp;
			}
			if(temp < menor){
				menor = temp;
			}
			acum += temp;
			cont++;
			System.out.println("Informe uma temperatura ou 0 para sair");
			temp = scan.nextDouble();
		}
		System.out.println("A maior temperatura = " + maior);
		System.out.println("A menor temperatura = " + menor);
		System.out.println("A média das temperaturas  = " + acum / cont);
	}

}

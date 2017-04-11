package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra M ou F");
		String letra = scan.nextLine();
		
		if(letra.equalsIgnoreCase("F")){
			System.out.println("Sexo Feminino");
		}else if(letra.equalsIgnoreCase("M")){
			System.out.println("Sexo Masculino");
		}else{
			System.out.println("Sexo inválido!");
		}
		

	}

}

package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o turno que você estuda");
		String turno = scan.next();
		
		switch(turno){
			case "M":
			case "m": System.out.println("Bom dia!");break;
			case "V":
			case "v": System.out.println("Boa tarde!");break;
			case "N":
			case "n": System.out.println("Boa noite!");break;
			default: System.out.println("período inválido");
			
		}

	}

	private static void Switch(String turno) {
		// TODO Auto-generated method stub
		
	}

}

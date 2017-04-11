package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra");
		String letra = scan.nextLine();
		
		switch(letra){
		case "a": 
		case "e":
		case "i":
		case "o":
		case "u": System.out.println("É vogal!");break;
		default:System.out.println("É consoante");break;
		}

	}

}

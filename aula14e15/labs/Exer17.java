package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com o ano");
		int ano = scan.nextInt();
		
		if((ano % 400 == 0) || (ano % 4 ==0 && ano % 100 != 100)){
			System.out.println("É bissexto");
		}else{
			System.out.println("Não é bissexto");
		}

	}

}

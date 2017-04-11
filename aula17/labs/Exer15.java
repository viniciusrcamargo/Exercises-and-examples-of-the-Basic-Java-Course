package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nézimo número da série de fibonati");
		int n = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.print(primeiro);
		System.out.print(","+segundo);
		//1,1,2,3,5
		
		
		for(int i = 3; i <= n; i++){
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.print(","+proximo);
		}

	}

}

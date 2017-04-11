package com.vinicius.cursojava.aula16;

public class LoopDoWhile {

	public static void main(String[] args) {
		int i = 15;
		int max = 15;
		
		do{
			i++;
			System.out.println("Valor de i = " + i);
		}while(i < max);
		System.out.println(i);
	}

}

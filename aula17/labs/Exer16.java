package com.vinicius.cursojava.aula17.labs;

public class Exer16 {

	public static void main(String[] args) {
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		
		System.out.print(primeiro);
		System.out.print(","+segundo);
		
		while(proximo <= 500){
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.print(","+proximo);
		}

	}

}

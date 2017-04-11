package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pos = 0, neg = 0;
		for(int i = 1; i <= 10; i++){
			System.out.println("Insira o " + i + " número");
			int num = scan.nextInt();
			if((num % 2) == 0){
				pos++;
			}else{
				neg++;
			}
		}
		System.out.println("Quantidade de nros. positivos = " + pos);
		System.out.println("Quantidade de nros. negativos = " + neg);

	}

}

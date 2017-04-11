package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [] a = new int[10];
		int qtdUm = 0, qtdZero = 0, percUm = 0, percZero = 0, i;
		
		for(i = 0; i < 10; i++){
			a[i] = (int)Math.round(Math.random() * 1);
			if(a[i] == 0){
				qtdZero++;
			}else{
				qtdUm++;
			}
		}
		percZero = qtdZero * 100 / i;
		percUm = qtdUm * 100 / i;
		System.out.println("Percentual de 0's  = " + percZero + "%");
		System.out.println("Percentual de 1's  = " + percUm + "%");

	}

}

package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero");
		int num1 = scan.nextInt();
		System.out.println("Entre com o segundo n�mero");
		int num2 = scan.nextInt();
		System.out.println("Entre com o terceiro n�mero");
		int num3 = scan.nextInt();
		
		if((num1 > num2) && (num1 > num3)){
			System.out.println("O primeiro n�mero � maior= " + num1);
		}else if((num2 > num1) && (num2 > num3)){
			System.out.println("O segundo n�mero � maior= " + num2);
		}else if((num3 > num1) && (num3 > num2)){
			System.out.println("O terceiro n�mero � maior= " + num3);
		}
		if((num1 < num2) && (num1 < num3)){
			System.out.println("O primeiro n�mero � menor= " + num1);
		}else if((num2 < num1) && (num2 < num3)){
			System.out.println("O segundo n�mero � maior= " + num2);
		}else if((num3 < num1) && (num3 < num2)){
			System.out.println("O terceiro n�mero � maior= " + num3);
		}

	}

}

package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe um valor para a");
		int a = scan.nextInt();
		if (a == 0){
			System.out.println("não é equação de segundo grau");
		}
		else{
		System.out.println("Informe um valor para b");
		int b = scan.nextInt();
		System.out.println("Informe um valor para c");
		int c = scan.nextInt();
		
		double delta = (b*b) - (4*a*c);
		if(delta < 0){
			System.out.println("Delta negativo");
		}else{
			System.out.println("Valor de Delta = " + delta);
			double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
			double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
			
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		}

	}

}

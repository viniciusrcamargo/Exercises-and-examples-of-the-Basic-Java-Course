package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor do primeiro produto");
		int n1 = scan.nextInt();
		System.out.println("Entre com o valor do segundo produto");
		int n2 = scan.nextInt();
		System.out.println("Entre com o valor do terceiro produto");
		int n3 = scan.nextInt();
		
		if(n1 < n2 && n1 < n3 && n2 < n3){
			System.out.println(n3 + " " + n2 + " " + n1);
		}else if(n2 < n1 && n2 < n3 && n3 < n1){
			System.out.println(n1 + " " + n3+ " " + n2);
		}else if(n3 < n1 && n3 < n2 && n1 < n2){
			System.out.println(n2 + " " + n1+ " " + n3);			
		}else if(n3 < n1 && n3 < n2 && n2 < n1){
			System.out.println(n1 + " " + n2+ " " + n3);			
		}

	}

}

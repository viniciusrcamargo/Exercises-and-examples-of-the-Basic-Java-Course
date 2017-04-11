package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double [] a = new double[10];
		System.out.println("Valores do vetor = ");
		for(int i = 0; i < a.length; i++){
			a[i] = Math.pow(2, i);
			System.out.print(a[i] + " ");
		}

	}

}

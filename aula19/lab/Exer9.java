package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

public class Exer9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] a = new int[10];
		int [] b = new int[10];
		double [] c = new double[10];
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Digite o " + (i+1) + " valor para o vetor A");
			a[i] = scan.nextInt();
			while(a[i] == 0){
				System.out.println("Digite um número diferente de 0");
				a[i] = scan.nextInt();
			}
		}
		for(int i = 0; i < b.length; i++){
			System.out.println("Digite o " + (i+1) + " valor para o vetor B");
			b[i] = scan.nextInt();
			while(b[i] == 0){
				System.out.println("Digite um número diferente de 0");
				b[i] = scan.nextInt();
			}
			c[i] = a[i] / b[i];
		}
		for(int i = 0; i < c.length; i++){
			System.out.println("A divisão do valor " + (i+1) + " dos vetores A e B é = " + c[i]);
		}

	}

}

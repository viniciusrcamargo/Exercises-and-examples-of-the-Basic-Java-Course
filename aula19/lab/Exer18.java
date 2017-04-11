package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int posicaoMa = 0, posicaoMe = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int [] a = new int[10];
		
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Informe a idade da pessoa");
			a[i] = scan.nextInt();
			if(a[i] > maior){
				maior = a[i];
				posicaoMa = i;
			}
			if(a[i] < menor){
				menor = a[i];
				posicaoMe = i;
			}
			}
		System.out.println("A maior idade digitada foi " + maior + " na posicao " + posicaoMa + " do vetor");
		System.out.println("A menor idade digitada foi " + menor+ " na posicao " + posicaoMe + " do vetor");

	}

}

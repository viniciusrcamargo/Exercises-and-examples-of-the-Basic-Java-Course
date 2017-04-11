package com.vinicius.cursojava.aula19.lab;

public class Exer1 {

	public static void main(String[] args) {
		int [] a = new int[5];
		int [] b = new int[5];
		
		a[0] = 10;
		a[1] = 15;
		a[2] = 19;
		a[3] = 44;
		a[4] = 70;
		//mostra o vetor a
		for(int i = 0; i < a.length; i++){
			b[i] = a[i];
			System.out.println("Valor " + i + " do vetor A = " + b[i]);
		}
		System.out.println();
		//atribui os valores do vetor a ao vetor b e mostra o vetor b
		for(int i = 0; i < a.length; i++){
			b[i] = a[i];
			System.out.println("Valor " + i + " do vetor B = " + b[i]);
		}

	}

}

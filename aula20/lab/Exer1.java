package com.vinicius.cursojava.aula20.lab;

import java.util.Random;

public class Exer1 {

	public static void main(String[] args) {
		
		int[][] numerosAleatorios = new int[4][4];
		int maior = Integer.MIN_VALUE;
		int linha = 0, coluna = 0;
		Random numeroRandom = new Random();
		
		for(int i = 0; i < numerosAleatorios.length; i++){
			for(int j = 0; j < numerosAleatorios[i].length; j++){
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}
		}
		
		System.out.println();
		
		System.out.println("Números inseridos na matriz");
		for(int i = 0; i < numerosAleatorios.length; i++){
			for(int j = 0; j < numerosAleatorios[i].length; j++){
				if(numerosAleatorios[i][j] > maior){
					maior = numerosAleatorios[i][j];
					linha = i;
					coluna = j;}
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("O maior valor da matriz é = " + maior);
		System.out.print("Ele esta na linha = " + linha);
		System.out.print(" coluna = " + coluna);
	}

}

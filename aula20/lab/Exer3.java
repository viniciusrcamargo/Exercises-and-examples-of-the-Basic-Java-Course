package com.vinicius.cursojava.aula20.lab;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] numeros = new int[3][3];
		int qtdPares = 0;
		int qtdImpares = 0;
		
		for(int i = 0; i < numeros.length; i++){
			for(int j = 0; j < numeros[i].length; j++){
				System.out.println("Entre com um valor para a posicao linha = " + i + " coluna = " +j);
				numeros[i][j] = scan.nextInt();
				if(numeros[i][j] % 2 == 0){
					qtdPares++;
				}else{
					qtdImpares++;
				}
			}
		}
		System.out.println();
		System.out.println("Números da matriz");
		for(int i = 0; i < numeros.length; i++){
			for(int j = 0; j < numeros[i].length; j++){
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Quantidade de números pares = " + qtdPares);
		System.out.println("Quantidade de números impares = " + qtdImpares);
	}

}

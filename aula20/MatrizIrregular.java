package com.vinicius.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de entrevistados ");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomeFilhos = new String[numEntrevistados][];
		
		for(int i = 0; i < nomeFilhos.length; i++){
			System.out.println("Entre com  a quantidade de filhos ");
			int qtdFilhos = scan.nextInt();
			
			nomeFilhos[i] = new String[qtdFilhos];
			for(int j = 0; j < nomeFilhos[i].length; j++){
				System.out.println("Digite o nome do filho "+(j+1));
				nomeFilhos[i][j] = scan.next(); 
			}
		}
		
		for(int i = 0; i < nomeFilhos.length; i++){
			System.out.println("Pessoa " + i + " tem " + nomeFilhos[i].length + " filhos");
			for(int j = 0; j < nomeFilhos[i].length; j++){
				System.out.println(nomeFilhos[i][j]);
			}
		}
		
	}
}
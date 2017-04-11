package com.vinicius.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do arquivo");
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocidade da internet");
		double velocidade = scan.nextDouble();
		
		double tempo = tamArquivo / velocidade;
		
		System.out.println("O tempo aproximado é " + tempo);

	}

}

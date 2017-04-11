package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de turmas");
		int numTurmas = scan.nextInt();
		
		int quantAlun;
		int soma = 0;
		boolean invalido = true;
		for(int i = 1; i <= numTurmas; i++){
			invalido = true;
			do{
			System.out.println("Entre com a quantidade de alunos por turma " + i);
			quantAlun = scan.nextInt();
			if(quantAlun <= 40){
				invalido = false;
			}else{
				System.out.println("Número de alunos inválido, digite novamente");
			}
			}while(invalido);
			soma += quantAlun; 
		}
		double media = soma / numTurmas;		
		System.out.println("A média é = " + media);
	}

}

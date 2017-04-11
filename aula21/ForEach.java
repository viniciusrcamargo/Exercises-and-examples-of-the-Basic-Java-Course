package com.vinicius.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		Random random = new Random();
		
		for(int i = 0; i < notas.length; i++){
			notas[i] = random.nextInt(10);//gera números randomicos de 0 a 10
		}
		
		System.out.println("Sem utilizar for each");
		for(int i = 0; i < notas.length; i++){
			System.out.print(notas[i] + " ");
		}
		System.out.println("");
		System.out.println("Utilizando for each");
		for(int nota : notas){//cria uma variavel para iterar o array
			System.out.print(nota + " ");
		}
		
		//exemplo 2
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 9;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		//output de matriz com for each
		System.out.println();
		System.out.println("Impressão de uma matriz com notas de alunos utilizando for esch");
		for(double[] notaAluno : notasAlunos){
			for(double nota : notaAluno){
				System.out.print(nota + " ");
			}
			System.out.println();
		}
	}

}

package com.vinicius.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
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
		
		
		for(int i = 0; i < notasAlunos.length; i++){
			for(int j = 0; j < notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] + " ");
			}
			System.out.println();
		}
		double soma = 0;
		System.out.println();
		System.out.println("Calculando a média de cada aluno ");
		for(int i = 0; i < notasAlunos.length; i++){
			soma = 0;
			for(int j = 0; j < notasAlunos[i].length; j++){
				soma += notasAlunos[i][j];
			}
			System.out.println("A média do aluno " + i + " é = " + (soma/4));
			System.out.println();
		}
		
		//Inicialização de vetor e matriz
		
		double[] notasAluno1 = {8,7,6,5};
		
		double[][] notasAluno2 = {{9,8,5,7}, {7,10,8,9}};
		System.out.println();
		System.out.println("Output da matriz notasAluno2 ");
		for(int i = 0; i < notasAluno2.length; i++){
			for(int j = 0; j < notasAluno2[i].length; j++){
				System.out.print(notasAluno2[i][j] + " ");
			}
			System.out.println();
		}

	}

}

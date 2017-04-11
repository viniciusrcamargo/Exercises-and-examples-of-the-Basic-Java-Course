package com.vinicius.cursojava.aula33.labs;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Aluno aluno = new Aluno();		
		
		
		System.out.println("Sistema Escolar Genaro");
		System.out.println("Infome o nome do aluno");
		aluno.setNome(scan.next());
		System.out.println("Infome o nome do Curso");
		aluno.setCurso(scan.next());
		System.out.println("Infome a matrícula do aluno");
		aluno.setMatricula(scan.nextInt());
		
		for(int i = 0; i < aluno.getDisciplina().length; i++){
			System.out.println("Infome a "+ (i+1) +" disciplina");
			aluno.setNomeDisciplina(i, scan.next());
		}
		for(int i = 0; i < aluno.getNotasDisciplinas().length; i++){
			System.out.println("Infome a nota da "+ (i+1) + " disciplina");
			aluno.setNotasDisciplinas(i, scan.nextDouble());
		}
		
		System.out.println("Situação do aluno "+ aluno.verificarAprovado(aluno.getNotasDisciplinas()));
		
	}

}

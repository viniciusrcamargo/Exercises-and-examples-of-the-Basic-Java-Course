package com.vinicius.cursojava.aula27.lab;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do aluno");
		aluno.nome = scan.next();
		System.out.println("Informe a matrícula do aluno");
		aluno.matricula = scan.nextInt();
		System.out.println("Informe o curso em que o aluno está matriculado");
		aluno.curso = scan.next();
		System.out.println("Informe a primeira disciplina do aluno");
		aluno.disciplina1 = scan.next();
		System.out.println("Informe a nota da primeira disciplina do aluno");
		aluno.nota1 = scan.nextDouble();
		System.out.println("Informe a segunda disciplina do aluno");
		aluno.disciplina2 = scan.next();
		System.out.println("Informe a nota da segunda disciplina do aluno");
		aluno.nota2 = scan.nextDouble();
		System.out.println("Informe a terceira disciplina do aluno");
		aluno.disciplina3 = scan.next();
		System.out.println("Informe a nota da terceira disciplina do aluno");
		aluno.nota3 = scan.nextDouble();
		
		System.out.println("O aluno = "+aluno.nome);
		System.out.println("Matricula nrº = "+aluno.matricula);
		System.out.println("Curso = "+aluno.curso);
		System.out.println("Disciplina = "+aluno.disciplina1+" situação = "+aluno.VerificarAprovacao(aluno.nota1));
		System.out.println("Disciplina = "+aluno.disciplina2+" situação = "+aluno.VerificarAprovacao(aluno.nota2));
		System.out.println("Disciplina = "+aluno.disciplina3+" situação = "+aluno.VerificarAprovacao(aluno.nota3));

	}

}

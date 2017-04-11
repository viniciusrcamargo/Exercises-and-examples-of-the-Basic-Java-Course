package com.vinicius.cursojava.aula43;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciencia da Computação");
		double [] notas = {10.0, 8.0, 9.0, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Ciencia da Computação");
		double [] notas2 = {10.0, 8.0, 9.0, 7};
		aluno.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));

	}

}

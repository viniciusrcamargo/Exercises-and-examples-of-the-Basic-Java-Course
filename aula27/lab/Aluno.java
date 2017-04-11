package com.vinicius.cursojava.aula27.lab;

public class Aluno {

	String nome;
	int matricula;
	String curso;
	String disciplina1, disciplina2, disciplina3;
	double nota1;
	double nota2;
	double nota3;
	
	
	String VerificarAprovacao(double nota){
		String situacao = "";
		if(nota >= 7){
			situacao = "aprovado";
		}else{
			situacao = "reprovado";
		}
		return situacao;
	}
}

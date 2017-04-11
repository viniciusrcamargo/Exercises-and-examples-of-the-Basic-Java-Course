package com.vinicius.cursojava.aula41;


public class Teste {

	public static void main(String[] args) {
		

		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		//pessoa.setEndereco("Rua Vinte, num774");
		aluno.setEndereco("Setembro, 1920");
		professor.setEndereco("Decalco, 333");
		
		//System.out.println(pessoa.obterEtiquetaEndereco());
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
		
		
		

	}

}

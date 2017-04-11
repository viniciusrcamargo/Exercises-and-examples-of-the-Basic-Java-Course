package com.vinicius.cursojava.aula61;

public class PassagemValorParametro {

	public static void main(String[] args) {
		
		Contato contato = new Contato("Contato 1", "1234-4567", "contato1@bol.com.br");
		int valor = 10;
		
		System.out.println("*** Valores Originais");
		System.out.println(contato);
		System.out.println(valor);
		
		testePassagemValorReferencia(valor, contato);
		
		System.out.println("*** Exemplo 1");
		System.out.println(contato);
		System.out.println(valor);
		
		testePassagemValorReferencia2(valor, contato);
		
		System.out.println("*** Exemplo 2");
		System.out.println(contato);
		System.out.println(valor);
		
		

	}
	
	private static void testePassagemValorReferencia(int valor, Contato contato){
		
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato = new Contato("Contato 2", "3235-5535","contato2@zmail.com");
	}
	
	private static void testePassagemValorReferencia2(int valor, Contato contato){
		
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato.setNome("Contato"+novoValor);
	}

}

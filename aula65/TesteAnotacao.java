package com.vinicius.cursojava.aula65;

@InformacaoAula(autor = "Vinicius", 
				aulaNumero = 65, 
				blog = "vinicius.com", site = "itu.com.br")

public class TesteAnotacao {
	@InformacaoAula(autor = "Vinicius", 
			aulaNumero = 65, 
			blog = "vinicius.com", site = "iluilu.com")
	public static void main(String[] args) {
		
		
	}

}

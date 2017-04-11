package com.vinicius.cursojava.aula60;

public class TesteEscopoVariaveis {

	public static void main(String[] args) {
		
		EscopoVariaveis escopo = new EscopoVariaveis();
		escopo.setValor(10);
		
		System.out.println(escopo.getValor());
		System.out.println(escopo.calaculaValor(20));
		System.out.println(escopo.getValor());

		System.out.println(escopo.teste());
		
		escopo.outroTeste();
		escopo.maisUmTeste();
		escopo.maisUmOutroTeste(10);
	}

}

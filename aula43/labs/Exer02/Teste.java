package com.vinicius.cursojava.aula43.labs.Exer02;

public class Teste {

	public static void main(String[] args) {
		
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setNomeContribuinte("Vinicius Rodrigues");
		pf1.setRendaBruta(1000);
		
		PessoaFisica pf2 = new PessoaFisica();
		pf2.setNomeContribuinte("Jao da Silva");
		pf2.setRendaBruta(2250);
		
		PessoaFisica pf3 = new PessoaFisica();
		pf3.setNomeContribuinte("Jao Sabão");
		pf3.setRendaBruta(3700);
		
		PessoaJuridica pr1 = new PessoaJuridica();
		pr1.setNomeContribuinte("TesteJunior");
		pr1.setRendaBruta(5000);
		
		PessoaJuridica pr2 = new PessoaJuridica();
		pr2.setNomeContribuinte("TestePai");
		pr2.setRendaBruta(15000);
		
		Contribuinte [] contribuintes = new Contribuinte[5];
		contribuintes[0] = pf1;
		contribuintes[1] = pf2;
		contribuintes[2] = pf3;
		contribuintes[3] = pr1;
		contribuintes[4] = pr2;
		
		for(Contribuinte c : contribuintes){
			System.out.println(c.toString());
		}

	}

}

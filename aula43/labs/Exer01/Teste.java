package com.vinicius.cursojava.aula43.labs.Exer01;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		
		ContaBancaria contaSimples = new ContaBancaria();
		
		System.out.println("**** TESTE CONTA BANCÁRIA ****");
		contaSimples.setNomeCliente("Vinciius Rodrigues Camargo");
		contaSimples.setNumConta("12345678");
		
		contaSimples.depositarValor(100);
		realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples, 70);
		System.out.println(contaSimples);
		
		//Conta Poupança
		System.out.println("\n");
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		System.out.println("**** TESTE CONTA POUPANÇA ****");
		contaPoupanca.setNomeCliente("Mauriceia Alves Rodrigues");
		contaPoupanca.setNumConta("606060");
		contaPoupanca.setDiaRendimento(3);
		
		contaPoupanca.depositarValor(100);
		realizarSaque(contaPoupanca, 50);
		realizarSaque(contaPoupanca, 70);
		
		if(contaPoupanca.calcularNovoSaldo(0.5)){
			System.out.println("Rendimento aplicado, novo saldo é de R$ = " + contaPoupanca.getSaldo());
		}else{
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
		}
		System.out.println(contaPoupanca);
		
		System.out.println("\n");
		//Conta Especial
		ContaEspecial contaEspecial = new ContaEspecial();
		
		System.out.println("**** TESTE CONTA ESPECIAL ****");
		contaEspecial.setNomeCliente("Eloisa Helena");
		contaEspecial.setNumConta("36367070");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositarValor(100);
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 70);
		System.out.println(contaEspecial);

	}
	
	private static void realizarSaque(ContaBancaria conta, double valor){
		if(conta.sacarValor(valor)){
			System.out.println("Saque efetuado com sucesso. Novo saldo = R$ " + conta.getSaldo());
		}else{
			System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de R$ "+ conta.getSaldo());
		}
	}

}

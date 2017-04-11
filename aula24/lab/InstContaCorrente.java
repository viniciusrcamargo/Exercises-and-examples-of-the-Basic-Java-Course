package com.vinicius.cursojava.aula24.lab;

public class InstContaCorrente {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaCorrente.numConta = "1234";
		contaCorrente.agencia = "Centro";
		contaCorrente.especial = true;
		contaCorrente.saldo = -300;
		
		System.out.println("Saldo da conta corrente R$ "+contaCorrente.saldo);

	}

}

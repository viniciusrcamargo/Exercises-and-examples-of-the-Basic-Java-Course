package com.vinicius.cursojava.aula27.lab;

public class ContaCorrente {

	int numero;
	double saldo = 300;
	boolean especial;
	double limite = 3000;
	
	
	void MostrarSaldo(){
		System.out.println("Saldo = R$ "+saldo);
	}
	
	double SacarDinheiro(double valor){
		if(valor > saldo || valor > limite){
			System.out.println("Valor indisponível em conta ou Limite ultrapassado");
			System.out.println("Tente novamente");
		}else{
			saldo -= valor;
		}
		MostrarSaldo();
		return saldo;
	}
	
	double DepositarDinheiro(double valor){
		saldo += valor;
		MostrarSaldo();
		return saldo;
	}
}

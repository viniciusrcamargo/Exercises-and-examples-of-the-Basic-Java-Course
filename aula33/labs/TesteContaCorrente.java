package com.vinicius.cursojava.aula33.labs;

import java.util.Scanner;



public class TesteContaCorrente {

	public static void main(String[] args) {
		int opc;
		double valor = 0;
		
		Scanner scan = new Scanner(System.in);
		
		ContaCorrente conta = new ContaCorrente();
		
		
		System.out.println("***********BANCO INTERNATIONAL VINICIU'S***********");
		System.out.println("Conta Corrente");
		System.out.println();
		System.out.println("Opções da Conta:");
		System.out.println("1 - Depositar:");
		System.out.println("2 - Sacar:");
		System.out.println("3 - Verificar Cheque Especial :");
		System.out.println("4 - Saldo:");
		opc = scan.nextInt();
		
		do{
		switch(opc){
		case 1:
			System.out.println("Informe o valor do depósito");
			valor = scan.nextDouble();
			System.out.println("Saldo atual = R$ "+conta.depositarValor(valor));
			break;
		case 2:
			System.out.println("Informe o valor do saque");
			valor = scan.nextDouble();
			System.out.println("Saldo atual = R$ "+conta.sacarValor(valor));
			break;
		case 3:
			System.out.println();
			conta.informarChequeEspecial();
			break;
		case 4: 
			System.out.println();
			conta.mostrarSaldo();
			break;
		}
		
		System.out.println("***********BANCO INTERNATIONAL VINICIU'S***********");
		System.out.println("Conta Corrente");
		System.out.println();
		System.out.println("Opções da Conta:");
		System.out.println("1 - Depositar:");
		System.out.println("2 - Sacar:");
		System.out.println("3 - Verificar Cheque Especial :");
		System.out.println("4 - Saldo:");
		System.out.println("5 - Sair:");
		opc = scan.nextInt();
		valor = 0;
		}while(opc > 0 && opc <= 4);

	}

}

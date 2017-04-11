package com.vinicius.cursojava.aula27.lab;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		ContaCorrente conta = new ContaCorrente();
		int opc;
		double valor;
		do{
			System.out.println("**********SYSTEMA BANCÁRIO**********");
			System.out.println("1 - Depositar: ");
			System.out.println("2 - Sacar: ");
			System.out.println("3 - Consultar: ");
			System.out.println("0 - Sair: ");
			opc = scan.nextInt();
			if(opc == 1){
				System.out.println("Informe o valor do depósito");
				valor = scan.nextDouble();
				conta.DepositarDinheiro(valor);
			}else if(opc == 2){
				System.out.println("Informe o valor do saque");
				valor = scan.nextDouble();
				conta.SacarDinheiro(valor);
			}else if(opc == 3){
				conta.MostrarSaldo();
			}
			
		}while(opc != 0);

	}

}

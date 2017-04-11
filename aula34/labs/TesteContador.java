package com.vinicius.cursojava.aula34.labs;

import java.util.Scanner;

public class TesteContador {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int opc;
		
		do{
		System.out.println("Classe contador");
		System.out.println("1 - Incrementar contador");
		System.out.println("2 - Zerar contador");
		System.out.println("3 - Decrementar contador");
		System.out.println("4 - Mostrar contador");
		System.out.println("0 - Sair");
		opc = scan.nextInt();
		switch(opc){
		case 1:
			Contador.incrementaContador();
		break;
		case 2:
			Contador.zerarContador();
		break;
		case 3:
			Contador.decrementarContador();
		break;
		case 4: 
			System.out.println("Quantidade do contador = "+ Contador.mostrarContador());
		}
		}while(opc != 0);
	}

}

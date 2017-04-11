package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean naoTerminar = true;
		int cod;
		int quantidade;
		double total = 0;
		String output = "";
		do{
			System.out.println("Digite o código e a quantidade, digite 00 para sair");
			cod = scan.nextInt();
			quantidade = scan.nextInt();
			
			if(cod == 0 && quantidade == 0){
				naoTerminar = false;
				output += "Total a pagar = R$ "+ total;
			}else{
				if(cod == 100){
					output+= "Cachorro quente -> 1,20 * " + quantidade;
					output+= " = " + (1.2*quantidade) + "\n";
					total+= 1.2*quantidade;
				}else if(cod == 101){
					output+= "Bauru simples -> 1,30 * " + quantidade;
					output+= " = " + (1.3*quantidade) + "\n";
					total+= 1.3*quantidade;
				}else if(cod == 102){
					output+= "Bauru com ovo  -> 1,50 * " + quantidade;
					output+= " = " + (1.5*quantidade) + "\n";
					total+= 1.5*quantidade;
				}else if(cod == 103){
					output+= "Hamburguer  -> 1,20 * " + quantidade;
					output+= " = " + (1.2*quantidade) + "\n";
					total+= 1.2*quantidade;
				}else if(cod == 104){
					output+= "Cheeseburguer  -> 1,30 * " + quantidade;
					output+= " = " + (1.3*quantidade) + "\n";
					total+= 1.3*quantidade;
				}else if(cod == 105){
					output+= "Refrigerante  -> 1,00 * " + quantidade;
					output+= " = " + (1*quantidade) + "\n";
					total+= 1*quantidade;
				}
			}
		}while(naoTerminar);
		System.out.println(output);

	}

}

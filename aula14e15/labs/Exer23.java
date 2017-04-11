package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Promoção Supermercado Tabajara Escolha umas das opções abaixo:");
		System.out.println("1 - File Duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		int opc = scan.nextInt();
		//terminar
		System.out.println("Informe a quantidade de carne");
		int quantCarn = scan.nextInt();
		System.out.println("Deseja pagar com o cartão Tabajara?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		int opcCart = scan.nextInt();
		
		double precoFile = 0;
		double precoAlcatra = 0;
		double precoPicanha = 0;
		double desconto = 0;
		double total = 0;
		double totalGeral = 0;
		// verifica o tipo da carne e a quantidade para atribuir o valor
		if((opc == 1) && (quantCarn <= 5)){
			precoFile = 4.9;
			total = quantCarn * precoFile;
		}else if((opc == 1) && (quantCarn > 5)){
			precoFile = 5.8;
			total = quantCarn * precoFile;
		}
		if((opc == 2) && (quantCarn <= 5)){
			precoAlcatra = 5.9;
			total = quantCarn * precoAlcatra;
		}else if((opc == 2) && (quantCarn > 5)){
			precoAlcatra = 6.8;
			total = quantCarn * precoAlcatra;
		}
		if((opc == 3) && (quantCarn <= 5)){
			precoPicanha = 6.9;
			total = quantCarn * precoPicanha;
		}else if((opc == 3) && (quantCarn > 5)){
			precoPicanha = 7.8;
			total = quantCarn * precoPicanha;
		}
		//verificar compra com cartão
		if(opcCart == 1){
			desconto = total * 0.05;
		}
		
		totalGeral = total - desconto;
		
		System.out.println("Valor total da compra = " + totalGeral);
		

	}

}

package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de litros vendido");
		double quant = scan.nextDouble();		
		System.out.println("Informe o tipo de combustivel");
		String tipo_Comb = scan.next();
		
		double precoGas = 2.5;
		double precoAlc = 2.9;
		double percDesc = 0;
		double total = 0;
		double totalDesconto;
		if(tipo_Comb.equalsIgnoreCase("a")){
			if(quant <= 20){
				percDesc = 3;
			}else{
				percDesc = 5;
			}
			total = quant * precoAlc;
		}else if(tipo_Comb.equalsIgnoreCase("g")){
			if(quant <= 20){
				percDesc = 4;
			}else{
				percDesc = 6;
			}
			total = quant * precoGas;
		}
	totalDesconto = (total / 100) * percDesc;
	
	double precoAPagar = total - totalDesconto;
	
	System.out.println("Valor a ser pago " + precoAPagar);
	}

}

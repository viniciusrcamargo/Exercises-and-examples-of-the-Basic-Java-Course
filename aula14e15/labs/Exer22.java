package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de morango");
		double quantMor = scan.nextDouble();
		System.out.println("Entre com a quantidade de maça");
		double quantMac = scan.nextDouble();
		double totalParc = 0;
		double totalDesc = 0;
		double percDesc = 0;
		double totalGeral = 0;
		
		double precoMorango = 0;
		if(quantMor <= 5){
			precoMorango = 2.5;
		}else{
			precoMorango = 2.2;
		}
		double precoMaca = 0;
		
		if(quantMac <= 5){
			precoMaca = 1.8;
		}else{
			precoMaca = 1.5;
		}
		totalParc = ((quantMac * precoMaca) + (quantMor * precoMorango));
		
		if((quantMac > 8) || (quantMor > 8) || (totalParc > 25)){
			percDesc = totalParc * 0.1;
		}
		
		totalGeral = totalParc - percDesc;
		System.out.println("Valor a ser pago = R$ " + totalGeral);
	}

}

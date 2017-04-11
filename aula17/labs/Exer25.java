package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int opc;
		double valor = 1, totalCompra = 0, dinheiro, total = 0;
		
		System.out.println("Lojas Tabajara");
		System.out.println("Informe o valor do Produto ou 0 para sair");
		do{
			for(int i = 0; i < valor; i++){
				System.out.print("Produto " + i + " R$ ");
				valor = scan.nextDouble();
				totalCompra += valor;
			}
			System.out.println("Valor total da compra R$ " + totalCompra);
			System.out.println("Informe o valor em dinheiro");
			dinheiro = scan.nextDouble();
			if(dinheiro > totalCompra){
				total = totalCompra - dinheiro;
				System.out.println("Valor do troco" + total);
			}else if(dinheiro < totalCompra){
				while(dinheiro < totalCompra){
					System.out.println("Quantia em dinheiro insuficiente");
					System.out.println("Informe o valor em dinheiro");
					dinheiro = scan.nextDouble();
				}
			}else if(dinheiro == totalCompra){
				System.out.println("Valor em dinheiro igual ao devido, não há troco");
			}
			System.out.println("Digite 1 para nova compra ou 0 para sair");
			opc = scan.nextInt();
		}while(opc == 1);

	}

}

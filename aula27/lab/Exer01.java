package com.vinicius.cursojava.aula27.lab;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Lampada lampada = new Lampada();
				
		System.out.println("Informe 1 para mostrar e ligar a lampada ou 2 para desligar ou 0 para sair");
		int opc = scan.nextInt();
		while(opc != 0){
			if(opc == 1){
				lampada.LigarLampada();
			}else if(opc == 2){
				lampada.DesligarLampada();
			}
			System.out.println();
			System.out.println("Informe 1 para mostrar e ligar a lampada ou 2 para desligar ou 0 para sair");
			opc = scan.nextInt();
		}

		System.out.println();
		System.out.println("fim do programa!");
	}
}

package com.vinicius.cursojava.aula20.lab;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][][] compromisso = new String[12][31][8];

		boolean sair = false;
		byte opc;
		while (!sair) {
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			opc = scan.nextByte();
			if (opc == 1) {// adicionar compromisso
				int mes = 0;
				boolean mesValido = false;
				while (!mesValido) {
					System.out.println("Entre com o mês");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente!");
					}
				}
				
				int dia = 0;
				boolean diaValido = false;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente!");
					}
				}
				
				int hora = 0;
				boolean horaValida = false;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 8) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, digite novamente!");
					}
				}
				mes--;
				dia--;
				System.out.println("Digite o compromisso");
				compromisso[mes][dia][hora] = scan.next();

			} else if (opc == 2) {// verificar comprimisso
				int mes = 0;
				boolean mesValido = false;
				while (!mesValido) {
					System.out.println("Entre com o mês");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente!");
					}
				}
				
				int dia = 0;
				boolean diaValido = false;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente!");
					}
				}
				
				int hora = 0;
				boolean horaValida = false;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 8) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, digite novamente!");
					}
				}
				mes--;
				dia--;
				System.out.println("O compromisso agendado é:");
				System.out.println(compromisso[mes][dia][hora]);
				
			} 

			
		}
	}

}

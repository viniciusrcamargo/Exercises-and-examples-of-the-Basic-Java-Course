package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double nota, media=0;
		int contador = 0;
		
		System.out.println("Informe uma nota ou 0 para sair");
		nota = scan.nextDouble();
		while(nota > 0){
			nota += nota;
			contador++;
			System.out.println("Informe uma nova nota ou 0 para sair");
			nota = scan.nextDouble();
		}
		if(nota == 0){
			System.out.println("N�o ha como calcular a m�dia!");
		}else{
		System.out.println("A m�dia de " + contador + " notas � " + nota / contador);}

	}

}

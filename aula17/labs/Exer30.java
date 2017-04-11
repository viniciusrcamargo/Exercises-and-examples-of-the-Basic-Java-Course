package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		double result = 0;
		
		System.out.println("Informe o n�mero para gerar a tabuada");
		int num = scan.nextInt();
		boolean invalido = true;
		int numInicio, numFinal;
		do{
			System.out.println("Informe um n�mero de inicio da tabuada");
			numInicio = scan.nextInt();
			System.out.println("Informe um n�mero de final da tabuada");
			numFinal = scan.nextInt();
			if(numFinal > numInicio){
				invalido = false;
			}
		}while(invalido);
		System.out.println("Tabuada de " + num + ":");
		System.out.println("Come�ar por " + numInicio);
		System.out.println("Terminar pot " + numFinal);
		System.out.println();
		for(int i = numInicio; i <= numFinal; i++){
			System.out.println(num + " x " + i + " = " + num*i);
		}

	}

}

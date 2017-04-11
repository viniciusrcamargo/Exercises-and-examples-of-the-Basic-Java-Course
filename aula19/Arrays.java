package com.vinicius.cursojava.aula19;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		double [] temperaturas = new double[365];//sintaxe de boa pratica de prog java
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("Temperatura do dia 1 " + temperaturas[0]);
		System.out.println("Temperatura do dia 2 " + temperaturas[2]);
		System.out.println("O tamanho do array "+ temperaturas.length);
		
		for(int i = 0; i < temperaturas.length; i++){
			System.out.println("O valor da temperatura do dis " + (i+1) + " é: " + temperaturas[i]);
		}
		//segunda opção de for não da acesso ao contador, só ao resultado.
		for(double temp : temperaturas){
			System.out.println(temp);
		}
		
		
		

	}

}

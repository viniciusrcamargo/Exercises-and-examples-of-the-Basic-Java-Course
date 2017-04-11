package com.vinicius.cursojava.aula19.lab;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double [] nota1 = new double[10];
		double [] nota2 = new double[10];
		double [] result = new double[10];
		
		
		for(int i = 0; i < nota1.length; i++){
			System.out.println("Informe as notas 1 e 2 do aluno " + (i+1));
			nota1[i] = scan.nextDouble();
			nota2[i] = scan.nextDouble();
			result[i] = (nota1[i] + nota2[i]) / 2;
			}
		for(int i = 0; i < result.length; i++){
			if(result[i] >= 7.0){
				System.out.println("O aluno " + (i+1) + " foi aprovado!");
			}else{
				System.out.println("O aluno " + (i+1) + " foi reprovado!");
			}
		}

	}

}

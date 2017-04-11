package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe o 1 lado de um triangulo");
		int lado1 = scan.nextInt();
		System.out.println("Informe o 2 lado de um triangulo");
		int lado2 = scan.nextInt();
		System.out.println("Informe o lado 3 de um triangulo");
		int lado3 = scan.nextInt();
		
		if(((lado1+lado2) > lado3) || ((lado2 + lado3) > lado1) || (lado1 + lado3)> lado2 ){
		if((lado1 == lado2) && (lado2 == lado3) && (lado1 == lado3)){
			System.out.println("Triangulo equilátero ");}
		else if((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)){
			System.out.println("Triangulo Isóceles ");}
		else if((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)){
			System.out.println("Triangulo escaleno ");}}
		else{
			System.out.println("Não é triangulo");
		}
	}
}

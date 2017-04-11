package com.vinicius.cursojava.aula34.labs;

import java.util.Scanner;

public class TesteCalculadora {


	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	Calculadora calc = new Calculadora();
	
	int opc;
		
		
		do{
		System.out.println("Classe Calculadora");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrairr");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("5 - Potência");
		System.out.println("0 - Sair");
		
		opc = scan.nextInt();
		if(opc != 0){
		System.out.println();
		System.out.println("Informe o primeiro valor");
		calc.setNumero1(scan.nextDouble());
		System.out.println("Informe o segundo valor");
		calc.setNumero2(scan.nextDouble());
		}
		
		switch(opc){
		case 1:
			System.out.println("Resultado da soma = " + Calculadora.somar(calc.getNumero1(), calc.getNumero2()));
		break;
		case 2:
			System.out.println("Resultado da subtração = " + Calculadora.subtrair(calc.getNumero1(), calc.getNumero2()));
		break;
		case 3:
			System.out.println("Resultado da multiplicação = "+Calculadora.multiplicar(calc.getNumero1(), calc.getNumero2()));
		break;
		case 4: 
			if(Calculadora.dividir(calc.getNumero1(), calc.getNumero2()) == 0){
				System.out.println("Não é possível fazer divisão, número igual a 0");
			}else{
				System.out.println("Resultado da divisão = " + Calculadora.dividir(calc.getNumero1(), calc.getNumero2())); 
			}
		break;
		case 5:
			System.out.println("Resultado da potência = " + Calculadora.potencia(calc.getNumero1(), calc.getNumero2()));
		}
		}while(opc != 0);

	}

}

package com.vinicius.cursojava.aula34.labs;

public class Calculadora {
	
	private double numero1;
	private double numero2;
	
	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	
	public static double somar(double num1, double num2){
		return num1 + num2;
	}
	
	public static double subtrair(double num1, double num2){
		return num1 - num2;
	}
	
	public static double multiplicar(double num1, double num2){
		return num1 * num2;
	}
	
	public static double dividir(double num1, double num2){
		if(num1 == 0 || num2 == 0){
			return 0;
		}else{
			return num1 / num2;
		}
	}
	
	public static double potencia(double num1, double num2){
		return Math.pow(num1, num2);
	}
	
	//5! = 5 * 4 * 3 * 2 * 1 = 120
	//0! = 1
	public static int fatorial(int num){
		if(num == 0){
			return 1;
		}
		int total = 1; 
		for(int i = num; i > 1; i--){
			total *= i;
		}
		return total;
	}
}

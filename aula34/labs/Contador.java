package com.vinicius.cursojava.aula34.labs;

public class Contador {
	
	private static int cont;
	
	public static void incrementaContador(){
		cont++;
	}
	
	public static void zerarContador(){
		cont = 0;
	}
	
	public static int mostrarContador(){
		return cont;
	}

	public static void decrementarContador(){
		cont--;
	}
}

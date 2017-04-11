package com.vinicius.cursojava.aula62;

public class ExemploVarargs {

	public static void main(String[] args) {
		
		
		System.out.println(soma(10,35));
		System.out.println(soma(10,30,50));
		
		int[] vetor = {15,30,50,30,60};
		System.out.println(soma(vetor));
		System.out.println("\nExemplo uso do Varargs");
		System.out.println(soma(1,5,7,8,9,15,35,44,50,36));
	}
	
	static int soma(int a, int b){
		return a+b;
	}
	
	static int soma(int a, int b, int c){
		return a+b+c;
	}
	
	static int soma(int[] soma){
		int total = 0;
		
		for(int i = 0; i<soma.length; i++){
			total += soma[i];
			}
	
		return total;
	}
	
	static int soma(Integer... vetor){//uso do Varargs, sempre declarar por ultimo para não confundir os parâmetros
		int total = 0;
		
		for(int i = 0; i<vetor.length; i++)
			total += vetor[i];
	
		return total;
	}

}

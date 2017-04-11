package com.vinicius.cursojava.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {

		System.out.printf("Hello %s", "Olá mundo");
		System.out.println();
		System.out.printf("Hello %S", "Olá mundo");//maiusculo
		System.out.println();
		
		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');
		
		System.out.printf("%n");//recomendado para pular linha usando printf
		
		int valor = 123456789;
		System.out.printf("%d", valor);
		System.out.println();
		double pontoFlutuante = 3.12345888;
		System.out.printf("%f", pontoFlutuante);
		System.out.println();
		String olaMundo = "Ola Mundo!";
		System.out.printf("%20s", olaMundo);//imprime 20 caracteres da string e alinha na esquerda
		System.out.println();
		System.out.printf("%-20s", olaMundo);//imprime 20 caracteres da string e alinha na direita
		
		System.out.println();
		System.out.printf("%+d", valor);//força a mostrar o simbolo, se é positivo ou não
		System.out.println();
		System.out.printf("%015d", valor);//valor terá 15 digitos e caso falte e comlete com 0
		System.out.println();
		System.out.printf("%,d", valor);
		
		int valor2 = -124578368;
		System.out.println();
		System.out.printf("% d", valor2);
		System.out.println();
		System.out.printf("% d", valor);
		
		System.out.println();
		System.out.printf("%.2f", pontoFlutuante);//define as casas decimais
		
		System.out.println();
		
		testeMaisCompleto();
		
	}
	
		private static void testeMaisCompleto(){
			double[] precos = {1000,123.4546, 74836.44, 117.48};
			
			for(int i = 0; i < precos.length; i++){
				System.out.printf("%s %02d: total de R$.10.2f%n", "Item ", i+1, precos[i]);
			}
		}
//Java.util.Formater
}

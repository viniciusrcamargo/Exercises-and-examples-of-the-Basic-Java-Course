package com.vinicius.cursojava.aula75_84;

public class Aula79 {

	public static void main(String[] args) {
		String banana = "banana";
		String ana = "ana";
		
		System.out.println(banana.indexOf('x'));//obter o indice de onde o caracter se encontra pela primeira vez
		System.out.println(banana.indexOf('b'));
		System.out.println(banana.indexOf('a'));
		
		System.out.println(banana.indexOf(ana));//retorna o indice de onde se encontra a string ou caracter pela primeira vez
		
		System.out.println(banana.lastIndexOf('a'));//retorna a ultima posição de onde o caracter ou string foi encontrada
		System.out.println(banana.lastIndexOf(ana));
		
		System.out.println(banana.contains(ana));//retorna true se contem a string informada ou false se não
		System.out.println(banana.contains("ceu"));//não contem em banana

	}

}

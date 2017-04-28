package com.vinicius.cursojava.aula75_84;

public class Aula80 {

	public static void main(String[] args) {
		
		String teste = "Isso é um teste.";
		
		System.out.println(teste);
		System.out.println(teste.substring(10));//retorna a partir da posição informada
		System.out.println(teste.substring(10, 15));
		
		String ola = "olá";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo);//ola + mundo
		System.out.println(olaMundo);
		
		String espacos = "i s p a ç o";
		String semEspacos = espacos.replace('i', 'e');//subistitui a segunda string pela primeira
		System.out.println(semEspacos);
		
		semEspacos = semEspacos.replaceAll(" ", "");//substitui todas as strings da segunda para a primeira informada
		System.out.println(semEspacos);
		
		String nome = " meu nome é: ";
		System.out.println(nome);
		System.out.println(nome.trim());//remove espaços antes e depois da string
		

	}

}

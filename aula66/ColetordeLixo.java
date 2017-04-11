package com.vinicius.cursojava.aula66;

import com.vinicius.cursojava.aula61.Contato;


public class ColetordeLixo {
	
	public static void obterMemoriaUsada(){
		
		final int MB = 1024 * 1024;
		
		Runtime runtime = Runtime.getRuntime();//singleton
		
		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
	}
	
	public static void main(String[] args){
	
		Contato[] contatos = new Contato[100000];
		Contato contato;
		
		for(int i = 0; i < contatos.length; i++){
			contato = new Contato("Contato"+i, "123-5777", "contato"+i+"@email.com.br");
			contatos[i] = contato;
		}
		
		System.out.println("Contatos criados");
		
		obterMemoriaUsada();
		contatos = null;
		
		Runtime.getRuntime().runFinalization();
		
		Runtime.getRuntime().gc();
		
		System.out.println("Contatos removidos da memória");
		
		obterMemoriaUsada();
	}
}

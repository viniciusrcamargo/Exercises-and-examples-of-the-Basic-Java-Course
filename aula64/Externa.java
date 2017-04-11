package com.vinicius.cursojava.aula64;

public class Externa {

	private String texto = "texto externo";
	
	public class Interna{
		private String texto = "texto interno";
		
		public void imprimeTexto(){
			System.out.println(texto);
			
			//classes internas conseguem acessar atributos das classes externas
			//System.out.println(Externa.this.texto);
		}
	}
}

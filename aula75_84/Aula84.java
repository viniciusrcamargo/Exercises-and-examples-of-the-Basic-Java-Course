package com.vinicius.cursojava.aula75_84;

import java.util.StringTokenizer;

public class Aula84 {

	public static void main(String[] args) {
		
		String doArquivo = "1;Vinicius;30";
		
		StringTokenizer st = new StringTokenizer(doArquivo, ";");//forma de se obter separadamente uma string grande, passando a própria depois o caracter separador
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());//extrai a informação da string tokenizer
		}

	}

}

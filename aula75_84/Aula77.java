package com.vinicius.cursojava.aula75_84;

import java.util.Arrays;

public class Aula77 {

	public static void main(String[] args) {

		String java = "Java";
		
		for(int i = 0; i < java.length(); i++){
			System.out.println(java.charAt(i));//charAt propriedade que pega a posição do array string 
		}
		
		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0);//primeiro passa a posição inicial, depois final, depois aonde vai atribuir depois de onde começar(posição da string)
		System.out.println(jav);
		
		byte[] javBytes = new byte[3];
		java.getBytes(0,3,javBytes,0);//mesma coisa que o getChars porém com o tipo byte
	
		System.out.println(Arrays.toString(javBytes));//retorna o valor asci dos caracteres
													  //Arrays.toString converte o valor para string
		
		char[] javaChars = java.toCharArray();//retorna o valor da String mas criando cada caracter separado como num array
		System.out.println(javaChars);
	}
	

}

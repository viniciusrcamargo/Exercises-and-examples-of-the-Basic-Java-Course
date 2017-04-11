package com.vinicius.cursojava.aula45;

public class Teste2 {

	public static void main(String[] args) {
		
	Object obj1 = obterString();
	String s1 = (String) obj1;
	
	Object obj2 = "Minha String";//Da certo por que o objeto referencia diretamente uma string
	String s2 = (String) obj2;
	
	Object obj3 = new Object();//Da erro por que o objeto não referencia nenhuma String
	String s3 = (String) obj3;
	
	Object obj4 = obterInteiro();
	String s4 = (String) obj4;
	

	}
	
	
	public static String obterString(){
		return "minha String";
	}
	
	public static int obterInteiro(){
		return 1;
	}

}

package com.vinicius.cursojava.aula85_100;

public class Aula85Math {

	public static void main(String[] args) {
		
		System.out.println(Math.pow(2, 3));//raiz quadrada
		
		System.out.println(Math.round(4.7));//arredondamento para cima ou baixo se for acima de 5 ou para baixo
		
		System.out.println(Math.round(4.2));
		
		System.out.println(Math.ceil(4.4));//sempre arredonda pra cima
		System.out.println(Math.ceil(4.7));
		
		System.out.println(Math.floor(4.4));//sempre arredonda pra baixo
		System.out.println(Math.floor(4.7));
		
		System.out.println(Math.random());//gera números aleatórios
		System.out.println(Math.round(Math.random()) * 100);//gera números aleatório de 0 a 100
		
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.cos(Math.toRadians(1)));
		System.out.println(Math.tan(Math.toRadians(45)));

	}

}

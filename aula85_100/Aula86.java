package com.vinicius.cursojava.aula85_100;

import java.util.Date;

public class Aula86 {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		System.out.println("Milisengundos desde 1 Jan 1970 " + hoje.getTime());

		System.out.println(hoje.getDate());//pegou dia do mês
		
	}

}

package com.vinicius.cursojava.aula85_100;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance();//singleton essa forma que se pega a data e instancia a classe
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR);
		int minuto = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.println(hoje);
		System.out.println(dia + " / " + mes + " / " + ano);
		System.out.println("Hora " + Calendar.HOUR_OF_DAY);
		System.out.println("minutos " + Calendar.MINUTE);
		System.out.println("Segundos " + Calendar.SECOND);
		
		System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", dia, (mes+1), ano, hora, minuto, segundos);
	}

}

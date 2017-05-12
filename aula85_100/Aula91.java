package com.vinicius.cursojava.aula85_100;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Aula91 {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(Locale.getDefault());
		
		String hojeFormatdado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatdado);
		
		Locale.setDefault(new Locale("pt", "BR"));
		
		hojeFormatdado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatdado);
		
		hojeFormatdado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatdado);
		
		hojeFormatdado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatdado);
		
		hojeFormatdado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatdado);
		
		hojeFormatdado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatdado);
		
		hojeFormatdado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatdado);
		

	}

}

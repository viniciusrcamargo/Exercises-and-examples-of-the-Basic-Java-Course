package com.vinicius.cursojava.aula85_100;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

	public static void main(String[] args) {

		//dd/MM/yyyy modo brasileiro
		//MM/dd/yyyy modo americano
		
		//1.000,02 modo brasileiro
		//1.000,02 modo americano
		
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		Locale[] locales = Locale.getAvailableLocales();
		for(Locale loc : locales){
			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("Código da lingua " + loc.getLanguage());
			System.out.println("---------------------------------------");
			System.out.println("Cod País " + loc.getCountry());
			System.out.println("País " + loc.getDisplayCountry());
		}
		
		Locale br = new Locale("pt", "Brazil");
		
		System.out.println(br);
		Locale.setDefault(br);
		System.out.println(Locale.getDefault());
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(50000000000d));
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf.format(50000000000d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(nf.format(50000000000d));
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(br);
		System.out.println(nf.format(50000000000d));
		
	}

}

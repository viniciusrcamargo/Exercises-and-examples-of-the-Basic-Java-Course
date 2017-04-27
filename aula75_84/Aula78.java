package com.vinicius.cursojava.aula75_84;

public class Aula78 {

	public static void main(String[] args) {
		
		String ola = "Ol�";
		String ola2 = "OL�";
		String ola3 = "Ol�";
		String ola4 = new String(ola);
		
		System.out.println("Ola equals ola2 " + ola.equals(ola2));
		System.out.println("Ola equals ola3 " + ola.equals(ola3));
		
		System.out.println("Ola equals ola2 " + ola.equalsIgnoreCase(ola2));
		
		System.out.println("ola == ola2 " + (ola == ola2));
		System.out.println("ola == ola3 " + (ola == ola3));//compara a refer�ncia de mem�ria
		
		System.out.println("ola == ola4 " + (ola == ola4));//O java atribui num pool de mem�ria as v�riaveis simples strings criadas e quando estancia cria um novo espa�o de mem�ria
		System.out.println("ola equals ola4 "+ ola.equals(ola4));
		System.out.println("ola equals ola4 "+ ola.equalsIgnoreCase(ola4));
		
		String banana = "banana";
		String ana = "ana";
		String ban = "ban";
		//string vn = "teste"; string com letra mai�scula n�o � poss�vel utilizar pois a String � uma classe utilit�ria do Java e string n�o �, nem tipo primitivo
		
		banana.regionMatches(1, ana, 0, 3);//a partir, string que compara, a partir de onde, tres caracteres
		System.out.println(banana.regionMatches(1, ana, 0, 3));
		System.out.println(banana.regionMatches(2, ana, 1, 2));
		banana.regionMatches(true, 0, ban, 0, 3);
		System.out.println(banana.regionMatches(true, 0, ban, 0, 3));
		
		System.out.println(banana.endsWith(ana));
		System.out.println(banana.startsWith(ban));
		
		String a = "a";
		String b = "b";
		String aMaiusculo = "A";
		
		//compareTo => -1 quando a > b / 0 a == b / 1 ou > 1 quando a < b
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo("a"));
		System.out.println(a.compareTo(aMaiusculo));
	}

}

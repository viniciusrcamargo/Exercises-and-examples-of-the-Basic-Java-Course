package com.vinicius.cursojava.aula27.lab;

public class Lampada {
	
	String tensao = "Bivolt";
	int potencia = 210;
	String cor = "cinza";
	String vidaUtil = "at� 35000 horas";
	double consumoEnergia = 3;
	String tipoDeLuz = "16 cores";
	
	void MostrarLampada(){
		System.out.println("Tens�o = "+tensao);
		System.out.println("Potencia = "+potencia);
		System.out.println("Cor = "+cor);
		System.out.println("Vida �til = "+vidaUtil);
		System.out.println("Consumo de energia = "+consumoEnergia);
		System.out.println("Tipo de luz = "+tipoDeLuz);
		System.out.println();
	}
	
	void LigarLampada(){
		MostrarLampada();
		System.out.println("L�mpada ligada!");
	}
	
	void DesligarLampada(){
		MostrarLampada();
		System.out.println("L�mpada Desligada!");
	}
}

package com.vinicius.cursojava.aula74.labs;

public enum CorSemafaro {

	VERDE(1000), AMARELO(300), VERMELHO(500);
	
	private int tempoEspera;
	
	CorSemafaro(int tempoEspera){
		this.tempoEspera = tempoEspera;
	}

	public int getTempoEspera() {
		return tempoEspera;
	}
}

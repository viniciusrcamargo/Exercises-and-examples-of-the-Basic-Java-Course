package com.vinicius.cursojava.aula47;

public class Circulo extends Figura2D {

	private int raio;

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return raio * raio * Math.PI;
	}
}

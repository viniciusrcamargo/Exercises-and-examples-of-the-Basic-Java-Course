package com.vinicius.cursojava.aula47;

public class Piramide extends Figura3D{

	private double altura;
	private double arestaBase;
	private double apotema;
	private int numPoliBase;
	
	private Figura2D base;
	
	
	
	public double getArestaBase() {
		return arestaBase;
	}
	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}
	public double getApotema() {
		return apotema;
	}
	public void setApotema(double apotema) {
		this.apotema = apotema;
	}
	
	public void setBase(Figura2D base) {
		this.base = base;
	}
	
	public int getNumPoliBase() {
		return numPoliBase;
	}
	public void setNumPoliBase(int numPoliBase) {
		this.numPoliBase = numPoliBase;
	}
	@Override
	public double calcularArea() {
		if(base != null){
		return (numPoliBase * ((arestaBase* apotema)/2)) + base.calcularArea();
		}
		return 0;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double calcularVolume() {
		if(base != null){
		return (base.calcularArea() * altura) /3;
		}
		return 0;
	}
	
}

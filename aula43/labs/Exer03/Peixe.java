package com.vinicius.cursojava.aula43.labs.Exer03;

public class Peixe extends Animal{
	
	private String caracteristicas;

	public Peixe(){
		this.setPatas(0);
		this.setAmbientes("Mar");
		this.setCor("Cinzenta");
		this.caracteristicas = "Barbatanas e cauda";
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
}

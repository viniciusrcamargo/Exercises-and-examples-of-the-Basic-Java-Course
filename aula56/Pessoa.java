package com.vinicius.cursojava.aula56;

public class Pessoa {

	private TipoDocumento tipoDocumento;
	private String numDocumento;
	
	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumDocumento() {
		return numDocumento;
	}
	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}
	public Pessoa(TipoDocumento tipoDocumento, String numDocumento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
	}
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pessoa [tipoDocumento=" + tipoDocumento + ", numDocumento="
				+ numDocumento + "]";
	}
	
	
}

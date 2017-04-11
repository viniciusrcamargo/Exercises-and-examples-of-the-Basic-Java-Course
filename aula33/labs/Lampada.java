package com.vinicius.cursojava.aula33.labs;

public class Lampada {

	private String tensao;
	private int potencia;
	private String cor;
	private String vidaUtil;
	private double consumoEnergia;
	private String tipoDeLuz;
	
	Lampada(String tensao, int potencia, String cor, String vidaUtil, double consumoEnergia, String tipoDeLuz){
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.vidaUtil = vidaUtil;
		this.consumoEnergia = consumoEnergia;
		this.tipoDeLuz = tipoDeLuz;
	}
	Lampada(){}
	
	public String getTensao(){
		return tensao;
	}
	
	public void setTensao(String tensao){
		this.tensao = tensao;
	}
	
	public int getPotencia(){
		return potencia;
	}
	
	public void setPotencia(int potencia){
		this.potencia = potencia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getVidaUtil() {
		return vidaUtil;
	}
	public void setVidaUtil(String vidaUtil) {
		this.vidaUtil = vidaUtil;
	}
	public double getConsumoEnergia() {
		return consumoEnergia;
	}
	public void setConsumoEnergia(double consumoEnergia) {
		this.consumoEnergia = consumoEnergia;
	}
	public String getTipoDeLuz() {
		return tipoDeLuz;
	}
	public void setTipoDeLuz(String tipoDeLuz) {
		this.tipoDeLuz = tipoDeLuz;
	}
	
	String situacaoLampada = "";
	public String acenderLampada(){
		situacaoLampada = "Lâmpada Acesa!";
		return situacaoLampada;
	}
	
	public String apagarLampada(){
		situacaoLampada = "Lâmpada Apagada!";
		return situacaoLampada;
	}
}

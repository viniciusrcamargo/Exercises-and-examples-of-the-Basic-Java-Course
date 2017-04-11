package com.vinicius.cursojava.aula43.labs.Exer01;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;

	
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + super.toString() + "]" ;
	}
	
	
	public boolean sacarValor(double valor){
		double saldoComLimite = this.getSaldo() + limite;
		if((saldoComLimite - valor) >= 0){
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}
		return false;
	}
	
}

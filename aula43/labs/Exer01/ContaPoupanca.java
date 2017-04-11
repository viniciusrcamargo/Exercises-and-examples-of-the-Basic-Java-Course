package com.vinicius.cursojava.aula43.labs.Exer01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{

	private int diaRendimento;
	
	
	
	
	public int getDiaRendimento() {
		return diaRendimento;
	}




	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	@Override
	public String toString() {
		return "ContaPoupanca [diaRendimento=" + diaRendimento
				+ ", getDiaRendimento()=" + getDiaRendimento()
				+ ", getNomeCliente()=" + getNomeCliente() + ", getNumConta()="
				+ getNumConta() + ", getSaldo()=" + getSaldo()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	




	public boolean calcularNovoSaldo(double taxaRendimento){
		Calendar hoje = Calendar.getInstance();
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}
}

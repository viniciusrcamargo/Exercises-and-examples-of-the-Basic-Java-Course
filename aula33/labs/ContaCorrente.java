package com.vinicius.cursojava.aula33.labs;

public class ContaCorrente {

	private int numeroConta;
	private double saldo;
	private boolean status;
	private double limite;
	
	ContaCorrente(int numeroConta, double saldo, boolean status, double limite){
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite;
	}
	
	ContaCorrente(){}
	
	public ContaCorrente(double limite, boolean status) {
		this.limite = 3000;
		this.status = false;
	}
	
	
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double depositarValor(double valor){	
		this.saldo += valor;
		return this.saldo;
	}
	
	public double sacarValor(double valor){//não está retornando certo quando valor > saldo
		if(valor < saldo){  
			saldo -= valor;
			
		}else
		if(valor > saldo || valor < limite){
			status = true;
			saldo -= valor;
		}
		return saldo;
	}
	
	public void informarChequeEspecial(){
		System.out.println("Status Cheque especial = "+this.status);
	}
	
	public void mostrarSaldo(){
		System.out.println("O saldo é "+ this.saldo);
		
	}
	
}

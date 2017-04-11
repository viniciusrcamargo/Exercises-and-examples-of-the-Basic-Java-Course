package com.vinicius.cursojava.aula43.labs.Exer01;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		//super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	
	public ContaBancaria() {
		super();
	}


	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta="
				+ numConta + ", saldo=" + saldo + "]";
	}


	public boolean sacarValor(double valor){
		if((saldo-valor) >= 0){
			saldo -= valor;
			return true;
		}
		return false;	
	}
	
	public void depositarValor(double valor){
		saldo += valor;
	}
	
	
	
}

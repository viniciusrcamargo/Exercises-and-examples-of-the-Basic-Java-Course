package com.vinicius.cursojava.aula36.labs;

public class Agenda {
	
	private String nomeAgenda;
	private Contato[] contatos;
	
	
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
}

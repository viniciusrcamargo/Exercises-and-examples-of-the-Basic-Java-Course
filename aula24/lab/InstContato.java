package com.vinicius.cursojava.aula24.lab;

public class InstContato {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		
		contato1.nome = "Joanes";
		contato1.endereço = "Paulista 100";
		contato1.email = "joao@email.com.br";
		
		contato1.telefones = new String[5];
		contato1.telefones[0] = "000-333555";
		contato1.telefones[1] = "111-345666";
		contato1.telefones[2] = "333-786990";
		
		System.out.println("Nome do contato = "+contato1.nome);
		System.out.println("Telefone do contato = "+contato1.telefones[2]);
		
		

	}

}

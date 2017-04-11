package com.vinicius.cursojava.aula36.labs;

import java.util.Scanner;

import com.vinicius.cursojava.aula36.Telefone;

public class TesteAgenda {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Agenda agenda = new Agenda();
		
		System.out.println("Informe o nome da agenda");
		agenda.setNomeAgenda(scan.next());

		System.out.println();
		Contato contato1 = new Contato();
		System.out.println("Informe o nome do primeiro contato");
		contato1.setNome(scan.next());
		System.out.println("Informe o telefone do primeiro contato");
		contato1.setTelefone(scan.next());
		System.out.println("Informe o email do primeiro contato");
		contato1.setEmail(scan.next());
		
		System.out.println();
		Contato contato2 = new Contato();
		System.out.println("Informe o nome do segundo contato");
		contato2.setNome(scan.next());
		System.out.println("Informe o telefone do segundo contato");
		contato2.setTelefone(scan.next());
		System.out.println("Informe o email do segundo contato");
		contato2.setEmail(scan.next());
		
		System.out.println();
		Contato contato3 = new Contato();
		System.out.println("Informe o nome do terceiro contato");
		contato3.setNome(scan.next());
		System.out.println("Informe o telefone do terceiro contato");
		contato3.setTelefone(scan.next());
		System.out.println("Informe o email do terceiro contato");
		contato3.setEmail(scan.next());
		
		Contato[] contatos = new Contato[3];
		contatos[0] = contato1;
		contatos[1] = contato2;
		contatos[2] = contato3;
		
		agenda.setContatos(contatos);
		
		System.out.println(agenda.getNomeAgenda());
		
		if(agenda != null && agenda.getContatos() != null){
			for(Contato c : agenda.getContatos()){
				System.out.println("Nome do contato " + c.getNome());
				System.out.println("Telefone do contato " + c.getTelefone());
				System.out.println("E-mail do contato " + c.getEmail());
				System.out.println();
			}
		}

	}

}

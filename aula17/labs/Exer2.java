package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

import javax.security.auth.login.LoginContext;

public class Exer2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Infome o nome de usu�rio");
		String login = scan.next();
		System.out.println("Informe sua senha");
		String senha = scan.next();
		while(login.equalsIgnoreCase(senha)){
			System.out.println("ERRO!!!");
			System.out.println("A senha n�o pode ser igual ao nome de usu�rio");
			System.out.println("Infome novamente o nome de usu�rio");
			login = scan.next();
			System.out.println("Informe novamente sua senha");
			senha = scan.next();
		}
		System.out.println("Logado com sucesso!");
		}
	//terminar
		

}

package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		String nome;
		int idade;
		double salario;
		String sexo, estadoCivil;
		do{	
		System.out.println("Entre com o nome");
		nome = scan.next();
		if(nome.length() > 3){
			infoValidas = true;
		}else{
			System.out.println("O nome precisa ser maior que três caracteres");
		}
		}while(!infoValidas);
		
		infoValidas = false;
		do{	
			System.out.println("Entre com a idade");
			idade = scan.nextInt();
			if(idade >= 0 && idade < 150){
				infoValidas = true;
			}else{
				System.out.println("A idade precisa estar entre 0 e 150 anos");
			}
			}while(!infoValidas);
		
		infoValidas = false;
		do{	
			System.out.println("Entre com o salário");
			salario = scan.nextDouble();
			if(salario > 0){
				infoValidas = true;
			}else{
				System.out.println("O salário precisa ser maior que 0");
			}
			}while(!infoValidas);

		infoValidas = false;
		do{	
			System.out.println("Entre com o sexo");
			sexo = scan.next();
			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
				infoValidas = true;
			}else{
				System.out.println("O sexo precisar ser m ou f");
			}
			}while(!infoValidas);
		
		infoValidas = false;
		do{	
			System.out.println("Entre com o estado Civil");
			estadoCivil = scan.next();
			if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
				infoValidas = true;
			}else{
				System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'");
			}
			}while(!infoValidas);
		
		System.out.println("Nome = " + nome);
		System.out.println("Idade = " + idade);
		System.out.println("Salário = " + salario);
		System.out.println("Sexo = " + sexo);
		System.out.println("Estado Civil = " + estadoCivil);
	}

}

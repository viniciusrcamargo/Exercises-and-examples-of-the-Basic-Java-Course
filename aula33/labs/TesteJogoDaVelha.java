package com.vinicius.cursojava.aula33.labs;

import java.util.Scanner;

public class TesteJogoDaVelha {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!ganhou){
			if(jogoDaVelha.VezJogador1()){
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
				sinal = 'X';
			}else{
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
				sinal = 'O';
			}
			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);
			
			jogoDaVelha.validarJogada(linha, coluna, sinal);
			
			jogoDaVelha.ImprimirTabuleiro();
			
			if(jogoDaVelha.VerificarGanhador('X')){
				ganhou = true;
				System.out.println("Parabéns jogador 1 ganhou!");
			}else if(jogoDaVelha.VerificarGanhador('0')){
				ganhou = true;
				System.out.println("Parabéns jogador 2 ganhou!");
			}else if(jogoDaVelha.getJogada() > 9){
				ganhou = true;
				System.out.println("Ninguem ganhou esta partida!");
			}
		}

	}
	
	static int valor(String tipoValor, Scanner scan){
		int valor = 0;
		boolean valorValido = false;
		while(!valorValido){
			System.out.println("Entre com a " + tipoValor + " (1,2,3)");
			valor = scan.nextInt();
			if(valor >=1 && valor <=3){
				valorValido = true;
			}else{
				System.out.println("Entrada inv�lida, tente novamente!");
			}
		}
		valor--;
		return valor;
	}

}

package com.vinicius.cursojava.aula27.lab;

public class JogoDaVelha {

	char[][] jogoVelha = new char[3][3];
	int jogada = 1;
	
	boolean validarJogada(int linha, int coluna, char sinal){
		if(jogoVelha[linha][coluna] == sinal||jogoVelha[linha][coluna] == 'O'){
			return false;
		}else{//jogada valida
			jogoVelha[linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}
	
	void ImprimirTabuleiro(){
		for(int i = 0; i < jogoVelha.length; i++){
			for(int j = 0; j < jogoVelha[i].length; j++){
				System.out.print(jogoVelha[i][j] + " | ");
			}
			System.out.println("");
		}
	}
	
	boolean VerificarGanhador(char sinal) {
		if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) || // linha 1
				(jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || // linha2
				(jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || // linha3
				(jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal)
				|| (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal)
				|| (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal)
				|| (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal)
				|| (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)) {
			return true;
		}
		return false;
	}
	
	boolean VezJogador1(){
		if(jogada % 2 == 1){
			return true;
		}
		return false; 
	}
}

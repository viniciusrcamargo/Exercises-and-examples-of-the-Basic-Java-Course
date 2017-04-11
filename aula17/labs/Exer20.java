package com.vinicius.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double media=0;
		int idade, contador = 0, opc;
		
		do{
			System.out.println("Informe sua idade ou 0 para sair");
			idade = scan.nextInt();
			contador++;
			idade += idade;
			System.out.println("Informe 1 para novo calculo ou 0 para sair");
			opc = scan.nextInt();
		}while(opc> 0);
		
		media = idade / contador;
		
		if((media > 0) && (media <= 25)){
			System.out.println("Turma Joven!");
		}else if((media > 25) && (media <= 60)){
			System.out.println("Turma adulta");
		}else if(media > 60){
			System.out.println("Turma idosa");
		}
		

	}

}

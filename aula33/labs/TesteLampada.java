package com.vinicius.cursojava.aula33.labs;

import java.util.Scanner;

public class TesteLampada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Lampada lamp = new Lampada();
		
		lamp.setTensao("110v");
		lamp.setCor("branca");
		lamp.setPotencia(220);
		lamp.setTipoDeLuz("Spot");
		
		System.out.println("Dados da Lampada");
		System.out.println("Tensão = " + lamp.getTensao());
		System.out.println("Cor = " + lamp.getCor());
		System.out.println("Potência = " + lamp.getPotencia());
		System.out.println("Tipo de luz = " + lamp.getTipoDeLuz());
		
		System.out.println();
		int opc = 1;
		while(opc == 1 || opc == 2){
			System.out.println("Escolha 1 para acender a Lâmpada, 2 para apagar ou 0 para sair");
			opc = scan.nextInt();
			if(opc == 1){
				System.out.println(lamp.acenderLampada());
			}else if(opc == 2){
				System.out.println(lamp.apagarLampada());
			}
		}
		System.out.println();
		System.out.println("Fim do programa!");

	}

}

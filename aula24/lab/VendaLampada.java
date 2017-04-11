package com.vinicius.cursojava.aula24.lab;

public class VendaLampada {

	public static void main(String[] args) {

		LampadaVenda lamp = new LampadaVenda();
		
		lamp.cor = "branca";
		lamp.tipo = "bocal";
		lamp.tensao = "bivolt";
		lamp.potencia = 7;
		lamp.quantidade = 10;
		lamp.valor = 1.5;
		lamp.garantiaMeses = 12;
		lamp.tiposAbajour = false;
		
		System.out.println("Cor da lampada = "+lamp.cor);
		System.out.println("Tipo da lampada = "+lamp.tipo);
		System.out.println("Potencia da lampada = "+lamp.potencia+" whz");
		System.out.println("Quantidade da venda = "+lamp.quantidade);
		System.out.println("Valor unitário da lampada R$ " + lamp.valor);
		System.out.println("Valor total da venda = R$ "+(lamp.quantidade * lamp.valor));
	}

}

package com.vinicius.cursojava.aula75_84;

public class Aula76 {

	public static void main(String[] args) {
		//concatena��o de strings
		String curso = "Curso ";
		String java = "Java";
		
		String cursoJava = curso + java;
		
		System.out.println(cursoJava);
		
		String resultado2Mais2 = "Resultado 2+2 = " + (2+2);
		System.out.println(resultado2Mais2);
		
		String resultado2Mais2_ = "Resultado 2+2 = " + 2+2;//se for fazer calculos com + precisa do parenteses
		System.out.println(resultado2Mais2_);
		
		String um = String.valueOf(1);//converte o valor para string
		System.out.println(um);
		
		String concatenacao = "Lorem Ipsum � simplesmente uma simula��o de texto da "
							+ "ind�stria tipogr�fica e de impressos, e vem sendo utilizado desde o "
							+ "s�culo XVI, quando um impressor desconhecido pegou uma bandeja de tipos"
							+ " e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum "
							+ "sobreviveu n�o s� a cinco s�culos, como tamb�m ao salto para a "
							+ "editora��o eletr�nica, permanecendo essencialmente inalterado. "
							+ "Se popularizou na d�cada de 60, quando a Letraset lan�ou decalques "
							+ "contendo passagens de Lorem Ipsum, e mais recentemente quando passou "
							+ "a ser integrado a softwares de editora��o eletr�nica como Aldus PageMaker.";
		System.out.println(concatenacao);
		
		String concatenacao2 = "Lorem Ipsum � simplesmente uma simula��o de texto da ";
				concatenacao2 += "ind�stria tipogr�fica e de impressos, e vem sendo utilizado desde o ";
				concatenacao2 += "s�culo XVI, quando um impressor desconhecido pegou uma bandeja de tipos";
				concatenacao2 += " e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum ";
				concatenacao2 += "sobreviveu n�o s� a cinco s�culos, como tamb�m ao salto para a ";
				concatenacao2 += "editora��o eletr�nica, permanecendo essencialmente inalterado. ";
				concatenacao2 += "Se popularizou na d�cada de 60, quando a Letraset lan�ou decalques ";
				concatenacao2 += "contendo passagens de Lorem Ipsum, e mais recentemente quando passou ";
				concatenacao2 += "a ser integrado a softwares de editora��o eletr�nica como Aldus PageMaker.";
System.out.println(concatenacao2);
	}

}

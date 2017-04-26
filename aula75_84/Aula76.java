package com.vinicius.cursojava.aula75_84;

public class Aula76 {

	public static void main(String[] args) {
		//concatenação de strings
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
		
		String concatenacao = "Lorem Ipsum é simplesmente uma simulação de texto da "
							+ "indústria tipográfica e de impressos, e vem sendo utilizado desde o "
							+ "século XVI, quando um impressor desconhecido pegou uma bandeja de tipos"
							+ " e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum "
							+ "sobreviveu não só a cinco séculos, como também ao salto para a "
							+ "editoração eletrônica, permanecendo essencialmente inalterado. "
							+ "Se popularizou na década de 60, quando a Letraset lançou decalques "
							+ "contendo passagens de Lorem Ipsum, e mais recentemente quando passou "
							+ "a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.";
		System.out.println(concatenacao);
		
		String concatenacao2 = "Lorem Ipsum é simplesmente uma simulação de texto da ";
				concatenacao2 += "indústria tipográfica e de impressos, e vem sendo utilizado desde o ";
				concatenacao2 += "século XVI, quando um impressor desconhecido pegou uma bandeja de tipos";
				concatenacao2 += " e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum ";
				concatenacao2 += "sobreviveu não só a cinco séculos, como também ao salto para a ";
				concatenacao2 += "editoração eletrônica, permanecendo essencialmente inalterado. ";
				concatenacao2 += "Se popularizou na década de 60, quando a Letraset lançou decalques ";
				concatenacao2 += "contendo passagens de Lorem Ipsum, e mais recentemente quando passou ";
				concatenacao2 += "a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.";
System.out.println(concatenacao2);
	}

}

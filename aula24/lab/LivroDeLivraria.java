package com.vinicius.cursojava.aula24.lab;

public class LivroDeLivraria {

	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.titulo = "O Senhor dos An�is - O Retorno do Rei.";
		livro.modelo = "Capa dura - edi��o de colecionador";
		livro.autor = "J.R.R.Tolkien";
		livro.genero = "Fic��o Cient�fica/ Aventura";
		livro.quantPaginas = 650;
		livro.valor = 60.00;

		
		System.out.println("LIVRO A VENDA");
		System.out.println("T�tulo - " + livro.titulo);
		System.out.println("Modelo - " + livro.modelo);
		System.out.println("Autor - " + livro.autor);
		System.out.println("G�nero - " + livro.genero);
		System.out.println("Quantidade de p�ginas - " + livro.quantPaginas);
		System.out.println("Valor  - R$ " + livro.valor);

	}

}

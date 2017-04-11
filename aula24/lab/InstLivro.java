package com.vinicius.cursojava.aula24.lab;

public class InstLivro {

	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.autor = "Loiane Groner";
		livro.genero = "Desenvolvimento de Sistemas";
		livro.titulo = "Mastering ExtJS";
		livro.modelo = "brochura";
		livro.quantPaginas = 250;
		livro.valor = 32.0;
		
		System.out.println("Titulo do livro = "+livro.titulo);
		System.out.println("Genero do livro = "+livro.genero);
		System.out.println("Autor(a) do livro = "+livro.autor);
		System.out.println("Modelo do livro = "+livro.modelo);
		System.out.println("Qtde de páginas do livro = "+livro.quantPaginas);
		System.out.println("Valor do livro = "+livro.valor);

	}

}

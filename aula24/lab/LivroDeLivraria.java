package com.vinicius.cursojava.aula24.lab;

public class LivroDeLivraria {

	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.titulo = "O Senhor dos Anéis - O Retorno do Rei.";
		livro.modelo = "Capa dura - edição de colecionador";
		livro.autor = "J.R.R.Tolkien";
		livro.genero = "Ficção Científica/ Aventura";
		livro.quantPaginas = 650;
		livro.valor = 60.00;

		
		System.out.println("LIVRO A VENDA");
		System.out.println("Título - " + livro.titulo);
		System.out.println("Modelo - " + livro.modelo);
		System.out.println("Autor - " + livro.autor);
		System.out.println("Gênero - " + livro.genero);
		System.out.println("Quantidade de páginas - " + livro.quantPaginas);
		System.out.println("Valor  - R$ " + livro.valor);

	}

}

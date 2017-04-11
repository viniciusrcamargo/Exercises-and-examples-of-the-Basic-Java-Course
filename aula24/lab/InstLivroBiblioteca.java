package com.vinicius.cursojava.aula24.lab;

import java.util.Date;

public class InstLivroBiblioteca {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livroBibli = new LivroDeBiblioteca();
		
		livroBibli.autor = "Loiane";
		livroBibli.genero = "Desenvolvimento";
		livroBibli.modelo = "Capa dura";
		livroBibli.titulo = "Mastering ExtJs";
		livroBibli.qtdPaginas = 500;
		livroBibli.emprestado = true;
		livroBibli.emprestadoA = "Vinicius";
		livroBibli.dataEmprestimo = new Date();
		
		System.out.println("Titulo do livro "+livroBibli.titulo);
	}

}

package com.vinicius.cursojava.aula75_84;

public class Aula82 {

	public static void main(String[] args) {
		
		//primeiro informar caracter que vai separar as letras, depois as letras
		String vinicius = String.join(", ", "V","I","N","U");
		System.out.println(vinicius);
		
		String[] letras = vinicius.split(", ");
		
		for(String letra: letras){
			System.out.println(letra);
		}
		
		String doArquivo = "1;Antonio;30";
		String[] infos = doArquivo.split(";");
		
		Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
		
		System.out.println(pessoa);
	}

}

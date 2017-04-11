package com.vinicius.cursojava.aula43.labs.Exer03;

public class Teste {

	public static void main(String[] args) {
		
		Animal camelo = new Animal();
		
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setPatas(4);
		camelo.setCor("Amarelo");
		camelo.setAmbientes("Terra");
		camelo.setVelocidade(2.0);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(6);
		tubarao.setVelocidade(1.5);
		
		Mamifero urso = new Mamifero();
		urso.setNome("Urso-do-Canadá");
		urso.setComprimento(180);
		urso.setPatas(4);
		urso.setCor("Vermelho");
		urso.setAmbientes("Terra");
		urso.setVelocidade(0.5);
		

		Animal[] animais = new Animal[3];
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = urso;
		
		for(Animal a : animais){
			System.out.println(a.toString());
		}
	}

}

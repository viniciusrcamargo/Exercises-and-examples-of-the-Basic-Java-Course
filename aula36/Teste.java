package com.vinicius.cursojava.aula36;

public class Teste {


	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("vinicius");
		//contato.setEndereco("Altino Arantes");
		//contato.setTelefone("36363636");
		
		//relacionamento tem um endereço
		//criar objeto endereco
		Endereco end = new Endereco();
		end.setNomeRua("Lenister");
		end.setNumero("S/N");
		end.setComplemento("Fazenda");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("9999878889");
		
		contato.setEndereco(end);
		
		//relacionamento tem um telefone
		Telefone tel = new Telefone();
		
		tel.setTipo("Celular");
		tel.setDdd("18");
		tel.setNumero("99798-3068");
		
		Telefone tel2 = new Telefone();
		
		tel2.setTipo("fixo");
		tel2.setDdd("17");
		tel2.setNumero("3636-4545");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
		
		//contato.setTelefone(tel);
		contato.setTelefones(telefones);
		
		//teste saida no console
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		if(contato != null && contato.getEndereco() != null){
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if(contato != null && contato.getTelefone() != null){
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if(contato != null && contato.getTelefones() != null){
			for(Telefone t : contato.getTelefones()){
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}

	}

}

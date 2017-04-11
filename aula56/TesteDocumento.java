package com.vinicius.cursojava.aula56;

public class TesteDocumento {

	public static void main(String[] args) {
		
		/*for(TipoDocumento doc: TipoDocumento.values()){
			System.out.println(doc + " - " + doc.geraNumeroTeste());
		}*/
		
		Pessoa pf = new Pessoa();
		
		System.out.println("Pessoa Física");
		pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pf.setNumDocumento(pf.getTipoDocumento().geraNumeroTeste());
		System.out.println(pf);
		
		System.out.println();
		System.out.println("Pessoa Jurídica");
		Pessoa pj = new Pessoa();
		
		pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pj.setNumDocumento(pj.getTipoDocumento().geraNumeroTeste());
		System.out.println(pj);
	}

}

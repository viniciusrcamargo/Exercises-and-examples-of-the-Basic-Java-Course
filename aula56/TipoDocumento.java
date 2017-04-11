package com.vinicius.cursojava.aula56;

public enum TipoDocumento {

	CPF {
		@Override
		public String geraNumeroTeste() {
			// TODO Auto-generated method stub
			return GeraCpfCnpj.cpf();
		}
	}, CNPJ {
		@Override
		public String geraNumeroTeste() {
			// TODO Auto-generated method stub
			return GeraCpfCnpj.cnpj();
		}
	};
	
	public abstract String geraNumeroTeste();
}

package com.vinicius.cursojava.aula46;

public interface BancoDeDados extends SqlDCL, SqlDDL, SqlDML{

	void abrirConexao();
	void fecharConexao();
	
}

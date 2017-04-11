package com.vinicius.cursojava.aula46;

public interface SqlDDL {

	void create(String query);
	void after(String query);
	void drop(String query);
	
}

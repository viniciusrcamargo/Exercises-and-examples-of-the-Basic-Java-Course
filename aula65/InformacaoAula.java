package com.vinicius.cursojava.aula65;

public @interface InformacaoAula {

	String autor();
	
	int aulaNumero();
	
	String blog() default "viniciuscoach.com";
	
	String site();
}

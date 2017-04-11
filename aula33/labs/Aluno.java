package com.vinicius.cursojava.aula33.labs;

public class Aluno {
	private String nome;
	private int matricula;
	private String Curso;
	private String [] disciplina = new String[3];
	private double [] notasDisciplinas = new double[1];
	private double media = 0;
	private String situacao;
	
	public Aluno(String nome, int matricula, String curso, String[] disciplina,
			double[] notas, String situacao) {
		this.nome = nome;
		this.matricula = matricula;
		this.Curso = curso;
		this.disciplina = disciplina;
		this.notasDisciplinas = notas;
		this.situacao = situacao;
	}
	
	Aluno(){}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}

	public String[] getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String[] disciplina) {
		this.disciplina = disciplina;
	}


	public double[] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	public void setNomeDisciplina(int pos, String nomeDisciplina){
		this.disciplina[pos] = nomeDisciplina;
	}
	
	public void setNotasDisciplinas(int posI, double nota){
		notasDisciplinas[posI] = nota;
	}

	public String verificarAprovado(double[] notasDisciplinas) {
		double soma = 0;
		
		for (int i = 0; i < notasDisciplinas.length; i++) {
			soma += notasDisciplinas[i];
		}
		this.media = (soma / 3);

		if (this.media >= 7.0) {
			situacao = ("Aluno aprovado com a média " + this.media);
		} else {
			situacao = ("Aluno reprovado com a média " + this.media);
		}
		return situacao;
	}
	
	
	
	
}

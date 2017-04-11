package com.vinicius.cursojava.aula60;

public class EscopoVariaveis {

	private int valor;
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int calaculaValor(int valor){
		valor = valor + 10;
		return valor;
	}
	
	public int teste(){
		int valor = 5;
		
		if(true){
			valor--;
		}
		return valor;
	}
	
	public void outroTeste(){
		//boolean flag = true;
		
		for(int i=0; i<10; i++){
			System.out.println(i);
		}
		
		//i++; //erro de compilação
		
		//for(int i=0; i<10; i++)//evitar esse tipo de código
			//System.out.println(i);//mesmo quando tiver só uma linha de código abaixo do for
		
		int j;
		for(j = 0; j<10; j++){
			System.out.println(j);
		}
		System.out.println(j);//valor de j = 10
	}
	
	public void maisUmTeste(){
		boolean flag = true;
		
		if(flag){
			int umaVariavel = 10;
			umaVariavel++;
			System.out.println(umaVariavel);
		}
	
		//System.out.println(umaVariavel);//erro de compilação
	}
	
	public void maisUmOutroTeste(int num){
		double total = 0;
		try{
			int outroNum = 10;
			
			total = num/outroNum;
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			total++;
			//outroNumm++;//erro de compilação
			//e.printStackTrace(); //erro de compilação
		}
		num++;
	}
	
	
	
}

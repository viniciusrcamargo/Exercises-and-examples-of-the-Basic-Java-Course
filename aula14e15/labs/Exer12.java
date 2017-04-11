package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora trabalhada");
		double valor_hora = scan.nextDouble();
		System.out.println("Informe a quantidade de horas trabalhadas no mês");
		double qtd_hora = scan.nextDouble();
		
		double salario_bruto = qtd_hora * valor_hora;
		double percentual_ir = 0;
		
		if (salario_bruto <= 900){
			percentual_ir = 0;
		}else if((salario_bruto > 900) && (salario_bruto <= 1500)){
			percentual_ir = 5;
		}else if((salario_bruto > 1500) && (salario_bruto <= 2500)){
			percentual_ir = 10;
		}else if(salario_bruto > 2500){
			percentual_ir = 20;
		}
		
		double ir = (salario_bruto / 100) * percentual_ir;
		double inss = (salario_bruto / 100) * 10;
		double fgts = (salario_bruto / 100) * 11;
		double totalDesconto = ir + inss;
		double salarioLiquido = salario_bruto - totalDesconto;
		
		System.out.println("Salário bruto "+ salario_bruto);
		System.out.println("Imposto de renda "+ ir);
		System.out.println("INSS "+ inss);
		System.out.println("FGTS "+ fgts);
		System.out.println("Total de descontos "+ totalDesconto);
		System.out.println("Salário liquido "+ salarioLiquido);
	}

}

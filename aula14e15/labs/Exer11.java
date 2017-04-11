package com.vinicius.cursojava.aula14e15.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o salário do colaborador");
		double salario = scan.nextDouble();
		double reajuste, salario_Bruto;
		
		if(salario < 280){
		 reajuste = salario * 0.2;
		 salario_Bruto = salario + reajuste;
		 System.out.println("Salário= " + salario);
		 System.out.println("Porcentagem do aumento foi de 20% ");
		 System.out.println("Valor do aumento= " + reajuste);
		 System.out.println("Salário bruto= " + salario_Bruto);		 
		}else if((salario > 280) && (salario < 700)){
			 reajuste = salario * 0.15;
			 salario_Bruto = salario + reajuste;
			 System.out.println("Salário= " + salario);
			 System.out.println("Porcentagem do aumento foi de 15% ");
			 System.out.println("Valor do aumento= " + reajuste);
			 System.out.println("Salário bruto= " + salario_Bruto);
		}else if((salario > 700) && (salario < 1500)){
			 reajuste = salario * 0.1;
			 salario_Bruto = salario + reajuste;
			 System.out.println("Salário= " + salario);
			 System.out.println("Porcentagem do aumento foi de 10% ");
			 System.out.println("Valor do aumento= " + reajuste);
			 System.out.println("Salário bruto= " + salario_Bruto);
		}else if(salario > 1500){
			reajuste = salario * 0.05;
			 salario_Bruto = salario + reajuste;
			 System.out.println("Salário= " + salario);
			 System.out.println("Porcentagem do aumento foi de 05% ");
			 System.out.println("Valor do aumento= " + reajuste);
			 System.out.println("Salário bruto= " + salario_Bruto);
		}
	}

}

package com.vinicius.cursojava.aula47;

public class Teste {

	public static void main(String[] args) {
		
		Quadrado quad = new Quadrado();
		quad.setLado(2);
		quad.setNome("Quadrado");
		
		Circulo circ = new Circulo();
		circ.setRaio(2);
		circ.setNome("Circulo");
		
		Triangulo triang = new Triangulo();
		triang.setAltura(2);
		triang.setBase(3);
		triang.setNome("Triangulo");
		
		Cubo cubo = new Cubo();
		cubo.setLado(3);
		cubo.setNome("Cubo");
		
		Cilindro cil = new Cilindro();
		cil.setAltura(3);
		cil.setRaio(2);
		cil.setNome("Cilindro");
		
		Piramide pir = new Piramide();
		pir.setAltura(3);
		pir.setApotema(4);
		pir.setArestaBase(2);
		pir.setNumPoliBase(4);
		pir.setBase(quad);
		pir.setNome("Piramide");
		
		FiguraGeometrica [] figuras = new FiguraGeometrica[6];
		figuras[0] = quad;
		figuras[1] = circ;
		figuras[2] = triang;
		figuras[3] = cubo;
		figuras[4] = cil;
		figuras[5] = pir;
		
		for(FiguraGeometrica figura : figuras){
			System.out.println("----------------------");
			System.out.println(figura.getNome());
			
			if(figura instanceof Figura2D){
				Figura2D f2d = (Figura2D) figura;
				System.out.println(f2d.calcularArea());
			}
			if(figura instanceof Figura3D){
				Figura3D f3d = (Figura3D) figura;
				System.out.println(f3d.calcularArea());
				System.out.println(f3d.calcularVolume());
			}
		}
	}

}

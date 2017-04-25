package com.vinicius.cursojava.aula75_84;

public class Aula75 {

	public static void main(String[] args) {
		
		String vazia = new String();
		System.out.println(vazia);
		
		String java = new String("Java");
		System.out.println(java);
		
		String java1 = new String(java);
		System.out.println(java1);
		
		char[] charsJava = {'J','A','V','A'};
		String java2 = new String(charsJava);
		System.out.println(java2);
		
		char[] abcdef = {'A','B','C','D','E'};
		String abc = new String(abcdef, 1, 3);
		System.out.println(abc);
		
		byte[] asci = {65, 66, 67, 68, 69};
		String abcde = new String(asci);
		System.out.println(abcde);

		String bcd = new String(asci, 1 ,3);
		System.out.println(bcd);
		
		String java3 = "JAVA";
		String java4 = "JAVA";
		
		System.out.println(java3);
		System.out.println(java4);
	}

}

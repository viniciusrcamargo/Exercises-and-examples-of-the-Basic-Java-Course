package com.vinicius.cursojava.aula69;

public class Teste {

	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 900);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1100);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();

		
			try {//termina todas as theads depois executa o proximo codigo
				t1.join();
				t2.join();
				t3.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		

		System.out.println("Programa finalizado");
	}
}



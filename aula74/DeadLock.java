package com.vinicius.cursojava.aula74;

public class DeadLock {

	public static void main(String[] args) {
		
		final String recurso1 = "Recurso #1";
		final String recurso2 = "Recurso #2";

		Thread t1 = new Thread(){
			public void run(){
				synchronized(recurso1){
					System.out.println("Thread #1: bloqueou recurso 1");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized(recurso2){
						System.out.println("Thread #1: bloqueou recurso 2");
					}
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				synchronized(recurso2){
					System.out.println("Thread #2: bloqueou recurso 2");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Thread #2: tentando acesso ao recurso 1");
					
					synchronized(recurso1){
						System.out.println("Thread #2: tentando o acesso ao recurso 1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}

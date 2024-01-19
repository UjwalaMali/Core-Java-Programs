 package com.extendsThread;

public class example extends Thread {
	
	public void run() {
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		example e= new example();
		e.start();
	}

}

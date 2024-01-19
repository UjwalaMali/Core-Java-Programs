package com.interfaceRunnable;

public class Example2 implements Runnable {
	
	public void run() {
		System.out.println("thread is running...");
	}
	public static void main(String[] args) {
		
		Example2 e= new Example2();
		Thread t =new Thread(e);
		t.start();
	}

}

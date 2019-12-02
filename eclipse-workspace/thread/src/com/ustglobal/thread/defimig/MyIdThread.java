package com.ustglobal.thread.defimig;

public class MyIdThread extends Thread {
public static void main(String[] args) {
	
	System.out.println("main started");
	
	System.out.println(Thread.currentThread().getId());
	
	MyIdThread mi = new MyIdThread();
	System.out.println("my id thread"+mi.getId());

	
	System.out.println("priority "+Thread.currentThread().getId());

	
	
	
	
	//Thread.currentThread().setPriority(11);//illegl argument exception
	
	
	//	m1.setId();

	
	
	
}
	
}

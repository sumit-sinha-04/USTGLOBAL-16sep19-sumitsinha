package com.ustglobal.thread.defimig;

public class Myprioritythread extends Thread {

	public static void main(String[] args) {


		System.out.println("main started");	

		int p =Thread.currentThread().getPriority();
		System.out.println("main thread priority "+p);

		Thread.currentThread().setPriority(7);


		int p1 =Thread.currentThread().getPriority();
		System.out.println("main thread priority "+p1);
		Myprioritythread t = new Myprioritythread();	
		int q = t.getPriority();


		System.out.println("my priority thread "+q);
		t.setPriority(5);
		
		System.out.println(t.getPriority());
		
		int p2 =Thread.currentThread().getPriority();
		
		System.out.println("currentthread priority"+p2);
		
		System.out.println("main ended");

		
		
	}


}

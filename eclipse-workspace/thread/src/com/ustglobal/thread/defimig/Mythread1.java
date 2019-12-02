package com.ustglobal.thread.defimig;

public class Mythread1 extends Thread  {

	public static void main(String[] args) {


		System.out.println("main started");

		String tname=	Thread.currentThread().getName();

		Thread.currentThread().setName("Bala");

		System.out.println("Current  thread "+tname);
		Mythread t1 = new Mythread();

		String  mname=	t1.getName();
		System.out.println("my thread name"+mname);
	//using current thread
		Thread.currentThread().setName("chotu");
		//directly
		t1.setName("gajodhar");
		System.out.println(t1.getName());
		System.out.println(10/0);

		System.out.println("main ended");


	}




}

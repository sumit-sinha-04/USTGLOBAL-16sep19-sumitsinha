package com.ustglobal.thread.defimig;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("main started");

		Mythread t1 = new Mythread();
//		Mythread t2 = new Mythread();
		t1.start();
	//	t2.start();
		for (int i = 0; i < 10; i++) {

			System.out.println("main thread");


		}

		System.out.println("main ended");

	}
}

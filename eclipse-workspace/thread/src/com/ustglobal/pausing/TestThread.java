package com.ustglobal.pausing;

public class TestThread {

	public static void main(String[] args) {

		System.out.println("main started");

		Mythread t = new Mythread();

		t.start();
		for (int i = 0; i < 10; i++) {

			System.out.println("main thread");
		}

		System.out.println("main ended");
	}
}

package com.ustglobal.pausing;


public class TestJoin {

	public static void main(String[] args) {

		System.out.println("main started");



		MyjoinThread t=  new MyjoinThread();

		t.start();
		try {

			t.join(10000,4000);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();


		}


		for (int i = 0; i < 10; i++) {

			System.out.println("main thread");

		}


		
		System.out.println("main ended");


		

	}
}

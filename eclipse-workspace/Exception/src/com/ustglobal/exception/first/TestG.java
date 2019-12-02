package com.ustglobal.exception.first;

public class TestG {

	public static void main(String[] args) {
		System.out.println("main Statred");
		Paytm p = new Paytm();
		try {
		p.book();
		}
		catch (Exception e) {
		System.out.println("Exception caught in main");
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("main ended");
		
	}
}

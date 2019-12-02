package com.ustglobal.exception.first;

public class PVR {

	void booking() {
		System.out.println("booking started");
		try {
		int a = 10/0;
		System.out.println("loigc of booking");
		System.out.println("booking done");
		}
		
		
		catch(ArithmeticException ae) {
			
			System.out.println("booking failed");
			throw ae;
		}
		}
}

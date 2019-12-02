package com.ustglobal.exception.first;

public class Paytm {

	void book() {

		System.out.println("paytm started");
		IRCTC r = new IRCTC();
		r.confirm();
		System.out.println("paytm ended");
	}
}

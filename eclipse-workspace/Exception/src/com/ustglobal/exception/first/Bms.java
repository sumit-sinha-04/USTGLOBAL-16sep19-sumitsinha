package com.ustglobal.exception.first;

public class Bms {
public static void main(String[] args) {
	
	
	System.out.println("Bms started");
	 
	PVR p = new  PVR();
	try {
		
		p.booking();
		System.out.println("booking confirmed");
	
	}
	catch (Exception e) {
	System.out.println("Booking failed");
	}
	System.out.println("bms ended");
}
}

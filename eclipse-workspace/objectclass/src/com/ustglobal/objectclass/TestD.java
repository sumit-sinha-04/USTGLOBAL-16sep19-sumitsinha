package com.ustglobal.objectclass;

public class TestD {

	public static void main(String[] args) {
		
		Car c = new  Car(690, "audi", "black");
		
		int l= c.hashCode();
		System.out.println(l);
		
		System.out.println(c);
	}
}

package com.ustglobal.objectclass;

public class TestF {

	public static void main(String[] args) {
		
		Cow c1 = new Cow(20, "basanti", 54766);
		Cow c2 = new Cow(20, "gowri", 54768);
		Cow c3 = new Cow(20, "basanti", 54766);
		
		System.out.println(c1.equals(c3));
		
	}
}

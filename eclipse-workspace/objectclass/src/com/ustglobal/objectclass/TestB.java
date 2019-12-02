package com.ustglobal.objectclass;

public class TestB {

//	static int n= 3464565;
	public static void main(String[] args) {
		
		Pen p = new Pen();
	int pHashCode=	p.hashCode();
		
		System.out.println(pHashCode);
	
	Object obj = new  Pen();
	 
	 System.out.println(obj.hashCode());
//	n.hashCode();
	
	}
}

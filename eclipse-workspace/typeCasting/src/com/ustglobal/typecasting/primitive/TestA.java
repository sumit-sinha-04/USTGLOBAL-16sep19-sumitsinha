package com.ustglobal.typecasting.primitive;

public class TestA {

	public static void main(String[] args) {

		byte a = 10;

		int b = a; // implicit typecasting
		System.out.println("b is "+b);	

		int p= 20;
		double q = p;
		System.out.println("q is "+q);
		System.out.println("==========================");

		double x= 20.67;
		int y= (int) x;
		System.out.println(y);
		char A='a';
		int z = (int) A;
		System.out.println(z);
		long ar= 455646l;

		int l =(int)ar;
		System.out.println(l);



	}



}

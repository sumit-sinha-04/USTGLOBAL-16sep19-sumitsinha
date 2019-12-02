package com.ustglobal.Arrays;

public class TestA {

	public static void main(String[] args) {

		int[] nums = new int[5];
		int [] b1= {10,20,30,40,50};
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=50;

		for (int i = 0; i < nums.length; i++) {

			System.out.println("ARRAY ELEMENT is-:"+nums[i]);

		}


		for (int j = 0; j < b1.length; j++) {

			System.out.println(b1[j]);


		}


		
		System.out.println("------------------------------");

		
		char []ch = {'a','b','c','d','e'};
		
		
	for (char i : ch) {
		
		System.out.println(i);
	}
	
	boolean[] b = {true,false,true,false};
	
	for (int i = 0; i < b.length; i++) {
		
		System.out.println(b[i]);
	}
	System.out.println("------------->------->");
	for (boolean c : b) {
		
		System.out.println(c);
	}
	
	
	byte[] b2= {2,3,4,5,6,7};
	
	System.out.println("------------>_");
	for (byte i = 0; i < b2.length; i++) {
	
		System.out.println(b2[i]);
	}
	
	System.out.println("___________________");
	for (byte c : b2) {
		
		System.out.println(c);
	}
	
	
	System.out.println("_________________________");
	double d3[]= {56.9,69.7,69.8,69.9,69.0};
	
	
	for (int i = 0; i < d3.length; i++) {
		
		System.out.println(d3[i]);
	}
	System.out.println("_________________");
	for (double d : d3) {
		
		System.out.println(d);
	}
	}
	





}

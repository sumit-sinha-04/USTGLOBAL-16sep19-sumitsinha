package com.ustglobal.exception.first;

public class TestE {

	public static void main(String[] args) {

		System.out.println("main started");
		String s = "hello";
		int[] a = {10,20,30};
		int b= 10;

		try {


			String s1= s.toUpperCase();
	       	System.out.println(s1);
			System.out.println(a[4]);
			System.out.println(b/0);

		}
		catch (ArrayIndexOutOfBoundsException  aie) {
			System.out.println("index not found");
			}		

		catch (Exception e) {
			e.printStackTrace();
		}

				
	}
}

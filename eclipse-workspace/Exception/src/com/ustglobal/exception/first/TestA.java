package com.ustglobal.exception.first;

public class TestA {

	public static void main(String[] args) {

		System.out.println("main started");

		int[] a = {10,20,30};

		try {
			System.out.println(a[0]);
			System.out.println(a[3]);
		}

		//		catch (Exception e) {
		//			System.out.println("Mandir wahi banega");
		//		}
		//		
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("e");
		}

		System.out.println("main end");




	}



}

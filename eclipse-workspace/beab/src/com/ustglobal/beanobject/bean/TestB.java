package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
         int age = sc.nextInt();
		System.out.println("Age1 is "+ age);
		System.out.println("enter a name");
		String name =sc.next();
		System.out.println("type your address");
		String address = sc.nextLine();
		System.out.println("addresss is"+address);

	}
}

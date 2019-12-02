package com.ustglobal.sorting.listassignment;
import java.util.Iterator;
import java.util.TreeSet;

public class TestI {

	public static void main(String[] args) {

		SortByName sb = new SortByName();
		TreeSet<Bank> ts  =new TreeSet<Bank>(sb);
		Bank b1 = new Bank("HDFC", 56008, 5687687);
		Bank b2 = new Bank("SBI", 56007, 7687687);
		Bank b3 = new Bank("Dena", 56005, 56687);
		Bank b4 = new Bank("SBI", 56004, 87687);
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);

		System.out.println("******using iterator****");

		Iterator<Bank> it = ts.iterator();
		while (it.hasNext()) {
			Bank b = it.next();
			System.out.println("name is "+ b.name);
			System.out.println("pincode is "+ b.pincode);
			System.out.println("micr  is "+ b.micr);
			System.out.println("======================");

		}



	}




}

package com.ustglobal.sorting.listassignment;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	public static void main(String[] args) {

		TreeSet<Customer> t = new TreeSet<Customer>();

		Customer c1 = new Customer("sumit", 1 ,5000);
		Customer c2 = new Customer("gajendra", 2 ,6000);
		Customer c3 = new Customer("ranjit", 3 ,1000000);
		t.add(c1);
		t.add(c2);	
		t.add(c3);

		System.out.println("******using iterator*****");

		Iterator<Customer> it = t.iterator();
		while (it.hasNext()) {
			Customer b  = it.next();
			System.out.println(b);
		}


	}
}

package com.ustglobal.sorting.listassignment;

import java.util.HashSet;
import java.util.Iterator;

public class TestG {


	public static void main(String[] args) {

		HashSet<Employee1> hs = new HashSet<Employee1>();

		Employee1 e1 = new Employee1(12, "giri", 50000);
		Employee1 e2 = new Employee1(12, "girish", 90000);
		Employee1 e3 = new Employee1(12, "giragira", 500000);

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		//hs.add(e)

		System.out.println("*********using iterator*********");

		Iterator<Employee1> it = hs.iterator();

		while (it.hasNext()) {
			Object  o =  it.next();
			System.out.println(o);
		}




	}







}

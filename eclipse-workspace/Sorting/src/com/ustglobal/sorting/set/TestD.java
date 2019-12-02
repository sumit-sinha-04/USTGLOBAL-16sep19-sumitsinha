package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {

		LinkedHashSet<Double> ls = new LinkedHashSet<Double>();
		ls.add(12.3);
		ls.add(25.6);
		ls.add(1.5);
		ls.add(1.9);

		for (Double double1 : ls) {
			System.out.println(double1);
		}


System.out.println("using iterator");
		Iterator<Double> it = ls.iterator();
		while (it.hasNext()) {
		Object o = it.next();
		System.out.println(o);
			
		}
		
		
		
	}
}

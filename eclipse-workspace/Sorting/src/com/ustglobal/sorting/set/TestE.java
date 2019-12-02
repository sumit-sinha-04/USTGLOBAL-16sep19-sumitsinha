package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestE {

	public static void main(String[] args) {

		TreeSet ls =  new TreeSet();

		ls.add(34);
	//	ls.add("nikita");
		ls.add(90);
		ls.add(99);
		//ls.add(null);


		for (Object object : ls) {
			System.out.println(object);
		}

System.out.println("*********using iterator**********");

		Iterator it = ls.iterator();


		while (it.hasNext()) {
			Object p = it.next();
			System.out.println(p);

		}


	}



}


package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {

	public static void main(String[] args) {

		LinkedHashSet ls =  new LinkedHashSet();

		ls.add(34);
		ls.add("nikita");
		ls.add(90);
		ls.add(99.9);
		ls.add(null);


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


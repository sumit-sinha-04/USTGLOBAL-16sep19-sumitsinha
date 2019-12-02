package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {
		
		HashSet <String> hs= new HashSet<String>();
		hs.add("vijay");
		hs.add("nirjay");
		hs.add("syed");
		hs.add("samiah");
		
		System.out.println("using for each");
		
		for (String string : hs) {
			
			System.out.println(string);
		}
		
		System.out.println("using iterator");
	Iterator<String>  it = hs.iterator();
	while (it.hasNext()) {
		String p = it.next();
		System.out.println(p);
		
	}
		
	}
}

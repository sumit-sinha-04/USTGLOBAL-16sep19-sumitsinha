package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(26.7);
		al.add(true);
		al.add("chinna");

		Iterator it = al.iterator();
		Object o1 = it.next();
		System.out.println("obj1 "+o1);

		Object o2 = it.next();
		System.out.println("objct2 "+o2);		
		
		Object o3 = it.next();
		System.out.println("obj1 "+o3);
		
		Object o4 = it.next();
		System.out.println("objct2 "+o4);		
		
//		Object o5 = it.next();
//		System.out.println("objct 2 "+o5);		
//		
		boolean b =it.hasNext();
		
		
		System.out.println(b);
		System.out.println("----------using for loop----------");
		for (Object object : al) 
			System.out.println(object);
		
		
		
		
	   ArrayList al1 = new ArrayList();
	al1.add(12);
	al1.add(233.4);
	al1.add("momo");
	al1.add(false);
		
		Iterator it1 = al1.iterator();
		while (it1.hasNext()) {
			Object o =  it1.next();
			System.out.println(o);
			
		}
		
		}

	}





package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestL {

	public static void main(String[] args) {


		LinkedList< Object> l = new LinkedList<Object>();
		l.add(12);
		l.add(13);
		l.add(34);
		l.add(23);
		l.add(10);
		//l.add("mkc");
		System.out.println(l);
System.out.println("l  before sorting -- "+l);
//	Collections.sort((List<T>) l);
	System.out.println("l  after sorting -- "+l);	
Collections.reverse(l);
System.out.println(l);	
	Collections.shuffle(l);
	System.out.println(l);
	
	}


}

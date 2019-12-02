package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
	public static void main(String[] args) {
		
		ArrayList<String > al = new ArrayList<String>();
		al.add("madarchod");
		al.add("bhenchod");
		al.add("betichod");
		al.add("bhosadchod");
	System.out.println("before sort "+al);
	Collections.sort(al);
	System.out.println("after sort "+al);
	}

}

package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add(12);
		hs.add(45);
		hs.add("deepa");
		hs.add(56.7);

System.out.println("****************using foreach*******************");
		


for (Object object : hs) {

	System.out.println(object);
	
	
}

System.out.println("using iterator");

Iterator it = hs.iterator();

while(it.hasNext())
{
	
Object s = it.next();


System.out.println(s);
}




	}

}


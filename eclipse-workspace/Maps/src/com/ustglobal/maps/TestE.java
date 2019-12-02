package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {

	public static void main(String[] args) {
		TreeMap<String, Integer> lh = new TreeMap<String, Integer>();
		lh.put("banglaore",560068);
		lh.put("haryana",560017);
		lh.put("jhansi",2840073);
		lh.put("null",2840073);
		lh.put("null1",2840074);
		System.out.println(lh);

		for(Map.Entry<String, Integer> m : lh.entrySet())
		{
			String k = m.getKey();
			int  m1=m.getValue();

			System.out.println("key is "+k+"\n"+"values is "+m1);


		}
	}
}
package com.ustglobal.maps;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestD {
	public static void main(String[] args) {


		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("banglaore",560068);
		lh.put("haryana",560017);
		lh.put("jhansi",2840073);



		System.out.println(lh);

		System.out.println(lh.keySet());
		System.out.println(lh.values());
		Set<String> s = lh.keySet();
		for (String string : s) {

			System.out.println("key is "+string);

			Collection <Integer> c = lh.values();
		System.out.println("====================");
			for (int string2 : c) {

				System.out.println(string2);
			}

		//	lh.put("banglaore", value)
		for(Map.Entry<String,Integer>m : lh.entrySet())
		{
		
			String key = m.getKey();
			Integer value =m.getValue();
			
			System.out.println("key is "+ key+"\n"+
					"  value is "+ value);
			
					
		}

	} 
	}
}
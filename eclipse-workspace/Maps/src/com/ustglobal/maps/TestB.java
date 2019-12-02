package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {

		HashMap h = new HashMap();


		h.put("kuku",6757686);

		h.put("kaku",757686);
		h.put("gajodhar",5557686);

		HashMap h1 = new HashMap();


		h1.put("riya",6757686);

		h1.put("angelpriya",757686);
		h1.put("tanu",5557686);

		System.out.println(	h.containsKey("riya"));
		System.out.println(h1.containsValue(5557686));	
		h.putAll(h1);
		System.out.println(h);

		System.out.println(h.size());
		System.out.println(h.isEmpty());
		h.clear();
		System.out.println(h);

		
		
		
	
	}


}

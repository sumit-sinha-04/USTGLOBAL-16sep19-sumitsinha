package com.ustglobal.maps;
import java.util.HashMap;
import java.util.Map;

public class TestA {

	public static void main(String[] args) {


		HashMap hm = new HashMap();
		hm.put("kuku", 99840);
		hm.put("mala", 89840);
		hm.put("sheela", 87840);
		hm.put("null", 89845);
		System.out.println("Data"+hm);
		hm.put("mala", 89845);
		System.out.println("Data"+hm);
		hm.put("bala", 89845);
		System.out.println("Data"+hm);
		Object name1=hm.get("sheela");
		Object name2=hm.get("munni");
		System.out.println("value is "+name2);

		Object o =		hm.remove("kuku");

		System.out.println(o);

		System.out.println("after removal"+ hm);
	}





}

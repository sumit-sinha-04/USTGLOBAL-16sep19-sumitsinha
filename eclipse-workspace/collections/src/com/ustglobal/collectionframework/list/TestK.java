package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {

	public static void main(String[] args) {


		ArrayList<Double > al = new ArrayList<Double>();
		al.add(34.5);
		al.add(23.5);
		al.add(32.5);
		al.add(36.5);
		// al.add(5, 30);
		al.add(null);
		al.add(2, 25.0);

		al.remove(3);
		System.out.println(al);


		Double val = al.get(3);
		al.remove(null);

		System.out.println(val);
		al.set(2, 77.6);
		System.out.println(al);
		//al.clear();
		//System.out.println(al);
		al.contains(54.6);

		List<Double> al1 = new ArrayList<Double>();

		al1.addAll(al);
		System.out.println(al1);
		boolean contain = al1.containsAll(al);
		System.out.println(contain);

	}
}

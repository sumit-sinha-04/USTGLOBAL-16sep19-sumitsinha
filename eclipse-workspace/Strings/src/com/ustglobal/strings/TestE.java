package com.ustglobal.strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestE {

	public static void main(String[] args) {


		ArrayList<Integer> marks  = new ArrayList<Integer>();

		marks.add(20);
		marks.add(23);		
		marks.add(5);
		marks.add(22);
		marks.add(4);
		marks.add(56);

		List<Integer> l = marks.stream().sorted().collect(Collectors.toList());

		Iterator<Integer> it  = l.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println("sorted is-:");
			System.out.println(i);
		}


	}
}
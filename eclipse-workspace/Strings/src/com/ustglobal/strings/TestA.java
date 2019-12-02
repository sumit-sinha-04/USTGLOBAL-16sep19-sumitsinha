package com.ustglobal.strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {

	public static void main(String[] args) {


		ArrayList<Integer> marks  = new ArrayList<Integer>();

		marks.add(20);
		marks.add(23);		
		marks.add(5);
		marks.add(22);
		marks.add(4);
		marks.add(56);

	Comparator<Integer> cmp= (m1,m2)->{
		if(m1>m2)
			return 1;
		else if (m1<m2)
		return -1;
		
		else
			return 0;
	}; 

		long noofFailedStudent = marks.stream().filter(i->i<40).count();

		System.out.println(noofFailedStudent);
		System.out.println("===========================");

		Integer i = marks.stream().min(cmp).get();

		     System.out.println("min value "+i);

	Integer j = marks.stream().max(cmp).get();
	System.out.println("max value is"+ j);
	
	
	}





}

package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort  {
	public static void main(String[] args) {


		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(1, "sumit", 65));
		al.add(new Student(2, "raveesh", 80));
		al.add(new Student(3, "ritesh", 35));
		al.add(new Student(4, "arnav", 68));
		al.add(new Student(5, "chodu", 90));
		

//	Comparator<T> c = new  ;

		
		Collections.sort(al);
		
		for (Student student : al) {
			System.out.println(student);
		}
		
	
}

	}

package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestA  {

		public static void main(String[] args) {
		
		
		ArrayList< Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(12, "sumit", 80);
		
		Student s2 = new Student(13, "gajendra", 50);
			
		Student s3 = new Student(14, "kriti", 40);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
		
		displayStudentDetails(al);
		Collections.sort(al);
	
		
		}
	
		static void displayStudentDetails(ArrayList<Student> al) {
		 
		Iterator<Student> it = al.iterator();
		
	while(it.hasNext())
	{
		Student s = it.next();
		System.out.println("id is"+ s.id);
		System.out.println("id is"+ s.name);
		System.out.println("id is"+ s.percentage);
		//System.out.println("id is"+ id);
	}
	
	
	

		
}

		

}
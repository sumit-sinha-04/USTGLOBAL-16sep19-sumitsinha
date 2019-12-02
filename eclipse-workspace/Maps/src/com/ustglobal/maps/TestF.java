package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {

	public static void main(String[] args) {

		Student s1 = new Student(1, "divya", 67.89);
		Student s2 = new Student(2, "priya", 59.89);
		Student s3 = new Student(3, "kammo", 60.89);
		Student s4 = new Student(4, "arnav", 61.89);
		Student s5 = new Student(5, "ritesh", 62.89);
		Student s6 = new Student(1, "annu", 67.89);
		Student s7 = new Student(2, "chinnu", 59.89);
		Student s8 = new Student(3, "lawdu", 60.89);
		Student s9 = new Student(4, "bhadwe", 61.89);
		Student s10 = new Student(5, "bhosad", 62.89);

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(s1);
		al.add(s2);
		al.add(s3);
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);

		al1.add(s6);
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		al2.add(s10);


		HashMap<String,ArrayList<Student>> hm=
				new HashMap<String, ArrayList<Student>>();


		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);

		//System.out.println(hm.get("second"));


		ArrayList<Student> first = hm.get("second");

		Iterator<Student > it = first.iterator();
		while (it.hasNext()) {
			Student s =  it.next();

			System.out.println("Id is"+s.id);
			System.out.println("name is"+s.name);
			System.out.println("percentage is"+s.percentage);

		}

	}
}

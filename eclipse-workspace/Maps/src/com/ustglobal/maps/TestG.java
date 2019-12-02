package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "gajodhar", 325000);
		Employee e2 = new Employee(2, "sumit", 355000);		
		Employee e3 = new Employee(3, "kriti", 325000);

		l.add(e1);
		l.add(e2);
		l.add(e3);


		ArrayList<Employee> l1 = new ArrayList<Employee>();
		Employee e4 = new Employee(4, "takla", 125000);


		Employee e5 = new Employee(5, "ranjit", 925000);
		Employee e6 = new Employee(6, "sohail", 825000);
		l1.add(e4);
		l1.add(e5);
		l1.add(e6);

		ArrayList<Employee> l3 = new ArrayList<Employee>();
		Employee e7 = new Employee(7, "lambu", 5000);
		Employee e8 = new Employee(8, "arnav", 25000);
		Employee e9 = new Employee(9, "ritesh", 25000);
		l3.add(e7);
		l3.add(e8);		
		l3.add(e9);


		HashMap<String,ArrayList<Employee>> hm=
				new HashMap<String, ArrayList<Employee>>();


		hm.put("first", l);
		hm.put("second", l1);
		hm.put("third", l3);

		ArrayList<Employee> first = hm.get("second");

		Iterator<Employee > it = first.iterator();
		while (it.hasNext()) {
			Employee s =  it.next();

			System.out.println("Id is"+s.id);
			System.out.println("name is"+s.name);
			System.out.println("percentage is"+s.salary);

		}
		System.out.println("===========================");
		ArrayList<Employee> first1 = hm.get("first");

		Iterator<Employee > it1 = first1.iterator();
		while (it.hasNext()) {
			Employee s1 =  it1.next();

			System.out.println("Id is"+s1.id);
			System.out.println("name is"+s1.name);
			System.out.println("percentage is"+s1.salary);

		}



	}
}

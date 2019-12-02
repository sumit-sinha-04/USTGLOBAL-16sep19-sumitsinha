package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestG {
	public static void main(String[] args) {

		Comparator<Employee> comp= (e1,e2)->{

			//		if(e1.id>e2.id)
			//		return 1;
			//		
			//		else if(e1.id<e2.id)
			//			return -1;
			//		else
			//			return 0;

			String l = e1.name;
			String m = e2.name;

			return l.compareToIgnoreCase(m);
		};










		TreeSet<Employee> ts = new TreeSet<Employee>(comp);

		Employee e1 = new Employee(4, "sumit", 5.6);
		Employee e2 = new Employee(1, "ritesh", 5.9);
		Employee e3 = new Employee(2, "gaitonde", 4.5);
		Employee e4 = new Employee(5, "kriti", 4.3);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);

		System.out.println("*************using iterator************");

		Iterator<Employee> it = ts.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println("Name is "+e.name);
			System.out.println("id is "+e.id);
			System.out.println("height is "+e.height);
			System.out.println("          ");
		}






	}
}

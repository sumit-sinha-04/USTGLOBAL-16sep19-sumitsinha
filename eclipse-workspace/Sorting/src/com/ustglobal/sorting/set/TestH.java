package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestH {
	public static void main(String[] args) {
		
Comparator<Employee> comp =	(e1,e2)->{
		
		if(e1.id>e2.id)
	return 1;
		
		else if(e1.id<e2.id)
			return -1;
		else
			return 0;
		
		
	}

	TreeSet<Employee> ts1 = new TreeSet<Employee>();
	
	Employee e1 = new Employee(4, "sumit", 5.6);
	Employee e2 = new Employee(1, "ritesh", 5.9);
	Employee e3 = new Employee(2, "gaitonde", 4.5);
	Employee e4 = new Employee(5, "kriti", 4.3);
	
	ts1.add(e1);
	ts1.add(e2);
	ts1.add(e3);
	
System.out.println("*************using iterator************");

Iterator<Employee> it = ts1.iterator();
while (it.hasNext()) {
	Employee e = it.next();
	System.out.println("Name is "+e.name);
	System.out.println("id is "+e.id);
	System.out.println("height is "+e.height);
System.out.println("          ");
}


	}
}

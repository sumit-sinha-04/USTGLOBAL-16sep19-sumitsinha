package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestB {

	public static void main(String[] args) {

		LinkedList<Laptop> l = new LinkedList<Laptop>();
		Laptop l1 = new Laptop(25000,4 ,"hp");
		Laptop l2 = new Laptop(35000,6 ,"dell");

		Laptop l3 = new Laptop(25000,8 ,"asus");
		Laptop l4 = new Laptop(35000,10 ,"lenovo");
l.add(l1);
l.add(l2);
l.add(l3);
l.add(l4);	
	
	displayLaptopDetails(l);
	}

	static void 	displayLaptopDetails(LinkedList< Laptop> l)
	{

		Iterator<Laptop> it = l.iterator();

		while (it.hasNext()) {
			Laptop lp = it.next();
			System.out.println("brand is"+lp.name);
			System.out.println("price is"+lp.price);
			System.out.println("ram is"+lp.ram);

		}

	}


}

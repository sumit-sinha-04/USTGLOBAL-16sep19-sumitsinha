package com.ustglobal.sorting.listassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import com.ustglobal.sorting.list.Student;

public class TestA {

	public static void main(String[] args) {

		LinkedList<Pen> lp	 = new LinkedList<Pen>();
		Pen p1 = new Pen(25, "parker");
		Pen p2 = new Pen(50, "reynolds");

		Pen p3 = new Pen(50, "abc");
		Pen p4 = new Pen(50, "xyz");

		lp.add(p1);
		lp.add(p2);
		lp.add(p3);
		lp.add(p4);



Collections.sort(lp);
		displayStudentDetails(lp);


	}




	static void displayStudentDetails(LinkedList<Pen> lp) {

		Iterator<Pen> it = lp.iterator();

		while(it.hasNext())
		{
			Pen s = it.next();
			System.out.println("id is"+ s.price);
			System.out.println("brand is"+ s.brand);



		}
}
}
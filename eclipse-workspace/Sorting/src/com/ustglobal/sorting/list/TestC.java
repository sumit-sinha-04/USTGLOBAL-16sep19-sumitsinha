package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {

	public static void main(String[] args) {


		LinkedList<Integer> l =  new LinkedList<Integer>();

		l.add(12);
		l.add(23);
		l.add(34);
		l.add(25);


		Integer peekElement = l.peek();
		System.out.println("peek elements"+peekElement);
		Integer peekFirstElement= l.peekFirst();

		System.out.println("peek first elements"+peekFirstElement);
		Integer peekLastElement= l.peekLast();

		System.out.println("peek last elements"+peekLastElement);


		System.out.println("================");

	Integer pollElement = l.poll();
	
	System.out.println("poll element"+l.poll());
	
Integer pollElement1 = l.pollFirst();
	
	System.out.println("poll first element"+pollElement1);
	
Integer pollElement2 = l.pollLast();
	
	System.out.println("poll element"+pollElement2);
	
		
	l.push(12);
	System.out.println("After push"+l);
	Integer p = l.pop();
	System.out.println(p);
	System.out.println("after pop"+l);
	
	
	}}

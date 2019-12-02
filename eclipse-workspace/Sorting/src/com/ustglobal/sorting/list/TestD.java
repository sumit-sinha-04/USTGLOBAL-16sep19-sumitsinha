package com.ustglobal.sorting.list;

import java.util.Stack;

public class TestD {

	public static void main(String[] args) {


		Stack<Integer> s = new Stack<Integer>();
		s.add(12);
		s.push(23);
		s.push(45);

		System.out.println("=================");
		for (int i = 0; i < s.size(); i++) {

			System.out.println(s.get(i));
		}
		System.out.println("===============");
		int k=s.size();
		for (int j = 0; j <k ; j++) {

			System.out.println(s.pop());
		}
	}



}

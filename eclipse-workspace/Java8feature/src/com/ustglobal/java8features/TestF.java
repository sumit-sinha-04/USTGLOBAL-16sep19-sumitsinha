package com.ustglobal.java8features;

import java.util.function.Consumer;

public class TestF {

	public static void main(String[] args) {




		Consumer<Student > c =s-> {

			System.out.println("Id is"+ s.id);
			System.out.println("name is"+ s.name);	
			System.out.println("percentage is"+ s.percentage);

		};

		//System.out.println(s.id);

		//s.accept(t);
		Student s1 = new Student(2, "sumit", 67.9);
		c.accept(s1);

	}
}

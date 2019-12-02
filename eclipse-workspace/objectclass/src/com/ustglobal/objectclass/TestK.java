package com.ustglobal.objectclass;

public class TestK {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person(2, "chapariya");
		System.out.println("p1 name"+p1.name);
		System.out.println("p1 id"+p1.id);
		Object o = p1.clone();	
		Person p2 = (Person) o;
		p2.id=200;
		p2.name="priya";
		System.out.println("----------------------------------- ");
		System.out.println("p2 id is -----> "+p2.id);
		System.out.println("p2 name is----> "+p2.name);	

	}
}

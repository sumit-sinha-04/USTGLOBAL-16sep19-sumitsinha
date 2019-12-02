package com.ustglobal.sorting.listassignment;

public class Customer {

	String name;
	int id;
	int salary;
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}


	public Customer(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	
	
}

package com.ustglobal.sorting.list;

import com.ustglobal.collectionframework.list.Student;

public class Laptop {

	int  price;
	int ram;
	String name;
	public Laptop(int price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Laptop [price=" + price + ", ram=" + ram + ", name=" + name + "]";
	}
		
		public int compareTo(Laptop s) {
	
			
	if(this.price>s.price)		
			return -1;
	else if(this.price<s.price)
	return 1;
	else
		return 0 ;
			}
			
}

package com.ustglobal.sorting.listassignment;

public class Pen implements Comparable<Pen> {


	@Override
	public int compareTo(Pen o) {

		String i = this.brand;
		String j = o.brand;

		return i.compareToIgnoreCase(j);


	}





	double price;
	String brand;

	public Pen(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}


	@Override
	public String toString() {
		return "Pen [price=" + price + ", brand=" + brand + "]";
	}






}

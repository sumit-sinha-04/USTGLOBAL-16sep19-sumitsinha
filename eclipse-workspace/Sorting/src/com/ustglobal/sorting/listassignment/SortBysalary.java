package com.ustglobal.sorting.listassignment;
import java.util.*;
public class SortBysalary implements Comparator<Customer> {


	@Override
	public int compare(Customer o1, Customer o2)

	{
		//		return o1.salary.compareTo(o2.salary);
		int i = o1.salary;
		int j = o2.salary;
		return i.compareTo(j);


	}
}

package com.ustglobal.java8features;

import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;
public class helper {

	void  displayAllStudent(ArrayList<Student> s )

	{




	}



	void displayfailedStudent(ArrayList<Student> al)
	{
		List<Student> l =	al.stream().filter(student->student.percentage<40).collect(Collectors.toList());


	}

}

package com.ustglobal.collectionframework.list;

//import com.ustglobal.sorting.list.Student;

public class Student implements Comparable<Student> {
     
//	@Override 
//	public int compareTo(Student s) {
//	if(this.id>s.id)
//	{
//		return 1;
//		
//	}
//	else if(this.id<s.id)
//	{
//		return -1;
//		
//	}
//	
//	else {
//	return 0;
//	}
//	}
	
	
	@Override
	public int compareTo(Student s) {
	//if(!this.name.equalsIgnoreCase( s.name))
		return this.name.compareToIgnoreCase(s.name);
//	else if(this.name<s.name)
//		return -1;
//	else 
		//return 0;
	
	
	
	
	}
	
	 int id;
     

	String name;
	double percentage;
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}


	
}

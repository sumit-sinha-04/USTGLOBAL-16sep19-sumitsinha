package com.ustglobal.Arrays;

public class TestC {

	static void recieve (Student[] stu)
	{
		for (Student student : stu) {
		System.out.println(student);
		}
	}
	public static void main(String[] args) {
		
	Student s1 = new Student(1, "name1", 69);
	Student s2 = new Student(2, "name2", 70);
	Student s3 = new Student(3, "name3", 71);	
	
	Student[] students = new Student[3];
	
	students[0]=s1;
	students[1]=s2;
	students[2]=s3;
	for (Student s : students) {
		System.out.println(s);
	}
	
	recieve(students7z);
	}
	}


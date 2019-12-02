package com.ustglobal.beanobject.bean;

public class Database {

void recieve( Student s)
{
	System.out.println("Id is"+s.getId());
   System.out.println("Name is"+ s.getName());
   System.out.println("Rollno is"+s.getRollNo());
    System.out.println("=====================");

    
}
void save(Employee e)
{
	System.out.println("Id is"+e.getId());
	System.out.println("Name is"+e.getName());
	System.out.println("salary is"+e.getSalary());

}

}

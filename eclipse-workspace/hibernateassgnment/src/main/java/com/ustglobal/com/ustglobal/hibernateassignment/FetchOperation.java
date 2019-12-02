package com.ustglobal.com.ustglobal.hibernateassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.hibernateassignment.dto.Employee;

//import com.ustglobal.JpaWithHibernateApp.dto.Product;

public class FetchOperation {

	

	public static void main(String[] args) {


		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager  = entityManagerFactory.createEntityManager();
		Employee  employee =manager.find(Employee.class, 101);
		System.out.println("ID is"+	employee.getId());
		System.out.println("Name----"+	employee.getName());
		System.out.println("salary is-----"+employee.getSalary());

	}
	//end of maon method


}//endof class

	


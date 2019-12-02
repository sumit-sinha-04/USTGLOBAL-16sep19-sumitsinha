package com.ustglobal.com.ustglobal.hibernateassignment;

import javax.persistence.EntityManager;
import com.ustglobal.hibernateassignment.dto.Employee;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.hibernateassignment.dto.Employee;

public class InsertOperation {

	
public static void main(String[] args) {
		
		Employee employee = new Employee();
	employee.setId(1);
	employee.setName("Sumit");
	employee.setSalary(20000);
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(employee);
	
		System.out.println("Record inserted succesfully");
	//	entityTransaction.commit();
		entityManager.close();
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	


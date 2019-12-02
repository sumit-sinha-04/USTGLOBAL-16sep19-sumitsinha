package com.ustglobal.JpaWithHibernateApp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.JpaWithHibernateApp.dto.Product;

public class InsertDemo {

	public static void main(String[] args) {
		
		Product productinfo = new Product();
		productinfo.setPid(103);
		productinfo.setPname("rubber");
	//	productinfo.set(10);
		productinfo.setQuantity(50);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(productinfo);
	
		System.out.println("Record inserted succesfully");
	//	entityTransaction.commit();
		entityManager.close();
	}
	
	
	
	
	
	
}

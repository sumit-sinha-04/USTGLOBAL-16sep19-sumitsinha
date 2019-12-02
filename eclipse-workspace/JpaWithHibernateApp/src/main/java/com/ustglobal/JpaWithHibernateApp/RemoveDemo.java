package com.ustglobal.JpaWithHibernateApp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.JpaWithHibernateApp.dto.Product;

public class RemoveDemo {

	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Product product = entityManager.find(Product.class, 101);
		entityManager.remove(product);
		System.out.println("Updated Record");
		
		
		entityTransaction.commit();
		
	}
		
		catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

	
	
	}

}}

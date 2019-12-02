package com.ustglobal.JpaWithHibernateApp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.JpaWithHibernateApp.dto.Product;

public class GetReference {


	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
	//	entityTransaction = entityManager.getTransaction();
	//	entityTransaction.begin();
		Product product = entityManager.getReference(Product.class, 100);
	//	entityManager.remove(product);
	//	System.out.println("Updated Record");
		System.out.println(product.getPid());
		System.out.println(product.getPname());	
		System.out.println(product.getQuantity());
	
	
	
	
	}
	}


package com.ustglobal.JpaWithHibernateApp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.JpaWithHibernateApp.dto.Product;

public class Reattaching {
	//ctrl+shift+L for eclipse shortcut
	public static void main(String[] args) {

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {


			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction= entityManager.getTransaction();
			entityTransaction.begin();
			Product product = entityManager.find(Product.class, 100);
			entityManager.detach(product);
			System.out.println(entityManager.contains(product));
			Product product1 = entityManager.merge(product);
			product1.setPname("Mobile");
			System.out.println("updated record");
			//use for detaching more than one object
			//---->	entityManager.clear();
			entityTransaction.commit();
		}

		catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}




	}
}

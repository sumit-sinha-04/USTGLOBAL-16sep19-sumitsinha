package com.ustglobal.Jpql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.JpaWithHibernateApp.dto.Product;

public class JpqlQuery {




	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
	      EntityTransaction entityTransaction = entityManager.getTransaction();	
	
	      String jpql ="select Pname from product"; 
	   Query query= entityManager.createQuery(jpql);
	// ArrayList<query> = new ArrayList<>; 
	List<String> product =   query.getResultList();
	System.out.println(product);
	
		}

		catch (Exception e) {
			e.printStackTrace();

		}



	}	



}

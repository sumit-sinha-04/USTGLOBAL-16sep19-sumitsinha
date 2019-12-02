package com.ustglobal.Jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

public class UpdateQuery {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
	      EntityTransaction entityTransaction = entityManager.getTransaction();	
	entityTransaction.begin();
	      String jpql ="update Product set pname='watch' where pid=100"; 
	      
	   Query query= entityManager.createQuery(jpql);
	// ArrayList<query> = new ArrayList<>; 
     int result = query.executeUpdate();
System.out.println(result);
		entityTransaction.commit();
	}
		catch (Exception e) {
			e.printStackTrace();
	entityManager.close();
		}
		
		
		finally {
			
	entityManager.close();
		}
		

}}
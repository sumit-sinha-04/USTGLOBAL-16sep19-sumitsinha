package com.ustglobal.JpaWithHibernateApp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.JpaWithHibernateApp.dto.Product;

public class CreateDemo {

	public static void main(String[] args) {


		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager  = entityManagerFactory.createEntityManager();
		Product  productDetail =manager.getReference(Product.class, 100);
		//Product  productDetail =manager.find(Product.class, 101);
		System.out.println("ID is"+	productDetail.getPid());
		System.out.println("Name----"+	productDetail.getPname());
		System.out.println("quantity is-----"+	productDetail.getQuantity());

	}
	//end of maon method


}//endof class

package com.ustglobal.main;

import java.util.List;

import com.ustglobal.dao.phone_dao;
import com.ustglobal.factory.factoryClass;
public class main {

	public static void main(String[] args) {
		
	
		
		phone_dao dao = factoryClass.getInstance();
		 dao.getAllinfo();

		 
		 
		 
		 
	}
	
	
	
	
	
}

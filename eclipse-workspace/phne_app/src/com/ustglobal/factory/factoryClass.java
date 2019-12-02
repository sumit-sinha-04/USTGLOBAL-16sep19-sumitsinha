package com.ustglobal.factory;

import com.ustglobal.dao.Phone_dao_impl;
import com.ustglobal.dao.phone_dao;

public class factoryClass {

	 public factoryClass() {
		// TODO Auto-generated constructor stub
	} 
	
	
	public static phone_dao getInstance() {
		
		phone_dao dao =  new Phone_dao_impl();
		return dao;
	
}
}

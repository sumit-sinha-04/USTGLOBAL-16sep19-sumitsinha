package com.ustglobal.singleton;

public class Test {

	public static void main(String[] args) {
		
		Mysingleton ms =  Mysingleton.getDbConnection();
	ms.s="hello";	
		System.out.println("hashcode of ms "+ms.hashCode());

	
		Mysingleton mx = Mysingleton.getDbConnection();
	 mx.s="hello";
	 
	System.out.println("hashcode of mx"+mx.hashCode());
	
	}
	
	
}

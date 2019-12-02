package com.ustglobal.singleton;

public class Mysingleton {
String s ="Hello";
	private static Mysingleton instance = null;
	private  Mysingleton() {
this.s;

	}

	public static Mysingleton getDbConnection() {
	
	if(instance ==null)
	{

		instance = new Mysingleton();
    
		return instance;
  
	}
	else
		return instance;
	
	

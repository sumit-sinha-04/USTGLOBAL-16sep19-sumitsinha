package com.ustglobal.accessmodifier.pkg1;

import com.ustglobal.accessmodifier.pkg2.Demo;

public class Run {

	public static void main(String[] args) {
		Demo d = new Demo();
		/*
		 * System.out.println(d.a); d.add();
		 * 
		 */			
	    
       System.out.println(d.b);
	   d.sub();
	   
	   System.out.println(d.c);
	   d.mul();
	   System.out.println(d.name);
	   d.div();
	   
	   
	   
       
	}
}

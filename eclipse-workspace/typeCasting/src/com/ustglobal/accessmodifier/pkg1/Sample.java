package com.ustglobal.accessmodifier.pkg1;

import com.ustglobal.accessmodifier.pkg2.Demo;

public class Sample {

//private a =10;
//
//public  void add()
//{
//a+5;	
//
//}

	public static void main(String[] args) {
		Demo d = new Demo();
		
		
		/*
		 * System.out.println(d.a); d.add();
		 * 
		 */		
		Sample s = new Sample();
		//protected
		System.out.println(s.c);
	    
       System.out.println(d.b);
	   d.sub();
	   
	   System.out.println(d.c);
	   d.mul();
	   System.out.println(d.name);
	   d.div();
	   
	   
	   
       
	}
      

}

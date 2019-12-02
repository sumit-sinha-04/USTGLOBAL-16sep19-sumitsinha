package com.ustglobal.stringclass;

public class TestA {
	public static void main(String[] args) {

		String s1= "aishu";
		String s2 ="deepika";
		String s3 = new String("aishu");
		String s4 = new String("aishu");
		String s5="aishu";
		String s ="mc";
		//   int p = (int)s;


		System.out.println(s1.equals(s2));//it will check for hashcode never use == for string use equals
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));

		System.out.println(s1.equalsIgnoreCase("aIsHU")); 

		System.out.println(s1);

		StringBuffer sb1= new StringBuffer("Kavya");
		sb1.append("x");
        
		System.out.println(sb1);

	}





}

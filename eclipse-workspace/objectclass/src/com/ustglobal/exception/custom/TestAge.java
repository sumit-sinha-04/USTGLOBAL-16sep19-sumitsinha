package com.ustglobal.exception.custom;

public class TestAge {

public static void main(String[] args) {
	
	System.out.println("main started");
Validator v = new Validator();
try {
v.verify(20);
}
catch (InvalidAgeException e) {
	System.out.println("Exception occured");
}
System.out.println("main ended");


}
}

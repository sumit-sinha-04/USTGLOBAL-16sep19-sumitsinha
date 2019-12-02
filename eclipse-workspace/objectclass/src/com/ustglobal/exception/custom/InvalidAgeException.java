package com.ustglobal.exception.custom;

public class InvalidAgeException extends RuntimeException{
	
	String message = "Invalid  age below 18 not allowed";
       
          public InvalidAgeException() {
        	  
        	  
        	  
          }
        
  public InvalidAgeException( String message) {
        	  
        	  this.message= message;
        	  
          }
        
	public String getMessage() {
	return message;
}
	

}

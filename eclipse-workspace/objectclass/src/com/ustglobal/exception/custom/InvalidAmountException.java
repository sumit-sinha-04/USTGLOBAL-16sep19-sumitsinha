package com.ustglobal.exception.custom;

public class InvalidAmountException extends Exception  {


	private String message = "daily limit is 40000";
	@Override
	public String getMessage() {

		return message;

	}

}

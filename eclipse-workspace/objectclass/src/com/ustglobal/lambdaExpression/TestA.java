package com.ustglobal.lambdaExpression;

public class TestA {
public static void main(String[] args) {
	

	greet  greetu = (message)->{
		System.out.println("hello");
		System.out.println(message);
	

	};
	 greetu.greetMessage("hola");
}
}
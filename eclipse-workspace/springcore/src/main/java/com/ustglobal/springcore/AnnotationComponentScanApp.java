package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobaldi.Hello;
import com.ustglobaldi.Pet;

public class AnnotationComponentScanApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext("beans.xml");
		
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("I love Java");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("timtim");
		System.out.println(pet.getName());
		
	}
}

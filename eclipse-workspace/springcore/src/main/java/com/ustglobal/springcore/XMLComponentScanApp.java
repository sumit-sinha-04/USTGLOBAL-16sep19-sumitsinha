package com.ustglobal.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobaldi.Hello;
import com.ustglobaldi.Pet;

public class XMLComponentScanApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("spring.xml");
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("I AM Sumit");
		System.out.println(hello.getMsg());
		Pet pet= context.getBean(Pet.class);
		pet.setName("Siri");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	
	
	}

}
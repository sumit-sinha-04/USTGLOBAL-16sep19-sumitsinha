package com.ustglobal.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobaldi.Animal;
import com.ustglobaldi.Hello;
import com.ustglobaldi.Pet;

public class AnnotationAPP {


	public static void main(String[] args) {


		AnnotationConfigApplicationContext	 context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Hello hello=context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		Animal animal = context.getBean(Animal.class);
		animal.makeSound();
		System.out.println("********************");
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		context.close();


	}
}

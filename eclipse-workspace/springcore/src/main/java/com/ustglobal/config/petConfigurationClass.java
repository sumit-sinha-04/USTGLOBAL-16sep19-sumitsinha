package com.ustglobal.config;

import org.springframework.context.annotation.Bean;

import com.ustglobaldi.Cat;
import com.ustglobaldi.Dog;
import com.ustglobaldi.Pet;

public class petConfigurationClass {
	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
		
		@Bean(name="cat")
		public Cat getCat()
		{
			return new Cat();
		}
		
	


	@Bean(name="pet")
	public Pet getPet()
	{
		Pet  pet = new Pet();
		pet.setName("bittu");
		pet.setAnimal(getDog());
		return pet;
	}

}

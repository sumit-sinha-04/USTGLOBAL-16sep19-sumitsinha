package com.ustglobal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobaldi.Cat;
import com.ustglobaldi.Dog;
import com.ustglobaldi.Hello;
import com.ustglobaldi.Pet;
@Configuration

public class ConfigurationClass {

	@Bean(name="hello")
	@Scope ("prototype")
    public Hello getHello()
	{
		Hello hello = new Hello();
		System.out.println(hello);
		Hello hello1 = new Hello();
		System.out.println(hello1);
		hello.setMsg("I loVe YOU");
		return hello;

	}

	

}

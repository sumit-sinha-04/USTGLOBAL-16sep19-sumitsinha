package com.ustglobaldi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanHostProcessarClass implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("beanbefore"+beanName);
		return bean;
	}
	

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("bean after intilization"+beanName);
		return bean;
	}

	
	
	
	
	
}

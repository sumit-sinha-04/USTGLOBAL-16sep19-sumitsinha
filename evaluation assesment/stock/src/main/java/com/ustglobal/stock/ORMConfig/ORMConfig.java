package com.ustglobal.stock.ORMConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
@Configuration
public class ORMConfig {

	@Bean
	public LocalEntityManagerFactoryBean getEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean bean =new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("stock-unit");
		return bean;
	}
}

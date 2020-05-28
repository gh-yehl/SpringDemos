package com.beanAllocation.javaConfigAllocation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beanAllocation.javaConfigAllocation.impl.Jack;
import com.beanAllocation.javaConfigAllocation.impl.Lexus;
import com.beanAllocation.javaConfigAllocation.interfaces.Car;

@Configuration
public class CarConfig {

	@Bean
//	Or set name like this @Bean(name="car")
	public Lexus setCar() {
		return new Lexus();
	}

}

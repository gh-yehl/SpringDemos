package com.beanAllocation.javaConfigAllocation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.beanAllocation.javaConfigAllocation.impl.Jack;
import com.beanAllocation.javaConfigAllocation.impl.Lexus;
import com.beanAllocation.javaConfigAllocation.interfaces.Car;

@Configuration
@Import(CarConfig.class)
public class DriverConfig {

	
	@Bean
	public Jack setJack(Car car) {
		Jack jack = new Jack();
		jack.setCarData(car);
		return jack;
	}
}

package com.beanAllocation.javaConfigAllocation.impl;

import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.beanAllocation.javaConfigAllocation.interfaces.Car;
import com.beanAllocation.javaConfigAllocation.interfaces.Driver;



public class Jack implements Driver{
	
//	@Autowired
	private Car car;
	
	public void setCarData(Car car) {
		this.car = car;
	}
	
	public void drive() {
		assertNotNull(car);
		car.run();
		System.out.println("Bran is --------->"+ car.brand);
	}

}

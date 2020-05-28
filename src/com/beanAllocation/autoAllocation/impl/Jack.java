package com.beanAllocation.autoAllocation.impl;

import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.beanAllocation.autoAllocation.interfaces.Car;
import com.beanAllocation.autoAllocation.interfaces.Driver;

@Component
public class Jack implements Driver{
	
//	@Autowired
	private Car car;
	
	@Autowired
	public void setCar(Car car) {
		this.car = car;
	}
//	@Autowired
//	private void setCarData(Car car) {
//		this.car = car;
//	}
	
	public void drive() {
		assertNotNull(car);
		car.run();
	}

}

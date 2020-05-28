package com.beanAllocation.xmlAllocation.impl;

import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.beanAllocation.xmlAllocation.interfaces.Car;
import com.beanAllocation.xmlAllocation.interfaces.Driver;


public class Jack implements Driver{

	private Car car;
	private String cd;

	Jack(Car car) {
		this.car = car;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}

	public void drive() {
		assertNotNull(car);
		car.run();

		System.out.println("CD name =============================>"+this.cd );
	}


	public void paint() {
		System.out.println("painting blue...");
	}
}

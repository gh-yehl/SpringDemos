package com.beanAllocation.xmlAllocation.impl;

import org.springframework.stereotype.Component;

import com.beanAllocation.xmlAllocation.interfaces.Car;



public class Lexus implements Car{
	
	public void run() {
		System.out.println("Lexus is running");
	}
}

package com.beanAllocation.javaConfigAllocation.impl;

import org.springframework.stereotype.Component;

import com.beanAllocation.javaConfigAllocation.interfaces.Car;



public class Lexus implements Car{
	private String newBrand = "";
	
	public void run() {
		
		System.out.println("Lexus is running");
	}
}

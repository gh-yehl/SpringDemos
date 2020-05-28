package com.beanAllocation.autoAllocation.impl;

import org.springframework.stereotype.Component;

import com.beanAllocation.autoAllocation.interfaces.Car;

@Component
public class Lexus implements Car{
	public void run() {
		System.out.println("Lexus is running");
	}
}

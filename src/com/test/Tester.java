package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beanAllocation.xmlAllocation.impl.Jack;
import com.beanAllocation.xmlAllocation.interfaces.Driver;

public class Tester {
	public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("file:D:\\Tech\\SpringTechs\\src\\main\\resources\\spring-config.xml");
        
        Jack jack = context.getBean(Jack.class);
        
        jack.paint();
	}

}

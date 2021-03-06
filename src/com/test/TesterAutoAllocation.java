package com.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.beanAllocation.autoAllocation.CarConfig;
import com.beanAllocation.autoAllocation.impl.Jack;
import com.beanAllocation.autoAllocation.interfaces.Car;
import com.beanAllocation.autoAllocation.interfaces.Driver;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CarConfig.class)
public class TesterAutoAllocation {
	
	@Autowired
	private Driver driver;
	
	@Test
	public void runCar() {
		System.out.println("running test...");
		assertNotNull(driver);
		System.out.println("running test...start to evoke Driver");
		driver.drive();
		System.out.println("running test...done");
	}

}

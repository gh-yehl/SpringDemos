package com.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.beanAllocation.javaConfigAllocation.DriverConfig;
import com.beanAllocation.javaConfigAllocation.interfaces.Driver;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DriverConfig.class)
public class TesterJavaConfigAllocation {
	
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

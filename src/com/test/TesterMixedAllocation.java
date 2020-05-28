package com.test;

import com.beanAllocation.mixedAllocation.GlobalConfig;
import com.beanAllocation.mixedAllocation.Nick;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= GlobalConfig.class)
public class TesterMixedAllocation {

    @Autowired
    //nick 必须 匹配xml bean id
    private Nick nick;

    @Test
    public void runCar() {
        System.out.println("running test...");
        assertNotNull(nick);
        System.out.println("running test...start to evoke Nick");
        nick.drive();
        System.out.println("running test...done");
    }
}

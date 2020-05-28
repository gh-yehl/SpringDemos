package com.beanAllocation.mixedAllocation;

import org.springframework.beans.factory.annotation.Autowired;

public class Nick {

    @Autowired
    private Lexus lexus;

    public void drive() {
        lexus.run();
    }
}

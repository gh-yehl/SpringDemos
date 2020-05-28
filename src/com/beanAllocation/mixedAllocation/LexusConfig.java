package com.beanAllocation.mixedAllocation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LexusConfig {

    @Bean
    public Lexus initiateLexus() {
        return  new Lexus();
    }

    @Bean
    public Nick initiateNick() {
        return  new Nick();
    }
}

package com.beanAllocation.mixedAllocation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(com.beanAllocation.mixedAllocation.LexusConfig.class)
@ImportResource("file:D:\\Learnings\\Spring\\spring4Demos\\src\\com\\beanAllocation\\mixedAllocation\\spring-config-nick.xml")
public class GlobalConfig {
}

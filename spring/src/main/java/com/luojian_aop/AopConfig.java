package com.luojian_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.luojian_aop")
@EnableAspectJAutoProxy
public class AopConfig {
}

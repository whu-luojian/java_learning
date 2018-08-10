/*
 * 运行，本例使用java配置,使用@Configuration和@Bean配置一个java配置类
 */
package com.luojian_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.say("java config"));
        context.close();
    }
}

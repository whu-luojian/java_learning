package com.luojian.base_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRun {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher teacher = (Teacher) context.getBean("myTeacher");
        System.out.println(teacher);
        System.out.println("--------------");
        Dog dog = (Dog)context.getBean("myDog");
        System.out.println(dog);
    }
}

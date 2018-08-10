package com.luojian.base_bean.cn;

import com.luojian.base_bean.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // 读取Spring配置文件
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu =  (Student) context.getBean("myStudent");
        Student stu2 = (Student) context.getBean("myStudent");
        stu.setName("luojian");
        stu.setAge(23);
        //Bean的作用域为singleton(单例模式)时，Spring只维护一个实例
        //Bean的作用域为prototype(原型模式)时，每次getBean都将产生一个新的实例
        System.out.println(stu);
        System.out.println(stu2);
    }
}

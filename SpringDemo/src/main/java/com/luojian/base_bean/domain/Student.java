package com.luojian.base_bean.domain;

/*
* JavaBean历程：
* pojo对象——servlet(jsp):JavaBean——Bean
* Bean:
*   1.属性
*   2.封装(getter和setter)
*   3.无参构造函数
* */
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 方便输出显示实例对象
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
        System.out.println("我是学生");
    }

}

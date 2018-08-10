package com.luojian;

import org.springframework.stereotype.Component;

@Component(value = "dog")
public class Dog {
    private int age = 3;
    private String color = "yellow";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog() {
    }

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

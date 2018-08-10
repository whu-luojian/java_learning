package com.luojian_aop;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
// java用  @interface Annotation{ } 定义一个注解 @Annotation，一个注解是一个类
public @interface Action {
    String name();
}

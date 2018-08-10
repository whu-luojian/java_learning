/*
* 使用注解的被拦截类
*/
package com.luojian_aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){

    }
}

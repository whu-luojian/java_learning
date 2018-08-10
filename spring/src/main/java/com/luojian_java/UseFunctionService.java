/*
 * 使用功能类的Bean
 */
package com.luojian_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service //java配置不需要注解
public class UseFunctionService {
    //@Autowired //java配置不需要注解
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String say(String word) {
        return functionService.sayHello(word);
    }
}

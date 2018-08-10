/*
 * 使用功能类的Bean
 */
package com.luojian_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
    @Autowired //注入Bean的注解
    FunctionService functionService;

    public String say(String word) {
        return functionService.sayHello(word);
    }
}

/*
* 编写功能类的Bean
*/
package com.luojian_java;

import org.springframework.stereotype.Service;

//@Service //java配置不需要注解
public class FunctionService {
    public String sayHello(String word) {
        return word;
    }
}

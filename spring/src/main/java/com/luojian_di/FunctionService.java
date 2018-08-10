/*
* 编写功能类的Bean
*/
package com.luojian_di;

import org.springframework.stereotype.Service;

@Service //注解声明Bean，Service表示在业务逻辑层（service层）使用
public class FunctionService {
    public String sayHello(String word) {
        return "Hello World";
    }
}

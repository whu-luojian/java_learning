/*
 * spring 配置类
 */
package com.luojian_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //声明当前类是一个配置类,意味着这个类中可能有0个或多个@Bean注解
//@ComponentScan("com.luojian_di")  //自动扫描包名下所有使用@Service、@Component、@Repository、@Controller
//的类，并注册为Bean
public class JavaConfig {
    @Bean //@Bean注解声明当前方法返回值是一个Bean,Bean的名称是方法名
    public FunctionService functionService(){
        return new FunctionService();
    }
    @Bean
    public UseFunctionService useFunctionService(){
        //先将FunctionService类的一个实例注入到useFunctionService实例中，再返回这个Bean对象
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }
}

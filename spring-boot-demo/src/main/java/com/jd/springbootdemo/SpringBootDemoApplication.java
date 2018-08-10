package com.jd.springbootdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 是Spring Boot的核心注解，是一个组合注解，包含以下三个注解：
 * 1. @Configuration: 表示该类是Spring Boot的配置文件类，标识这个类可以使用Spring IoC容器作为bean定义的来源
 * 2. @EnableAutoConfiguration: 自动配置Spring的上下文，让Spring Boot根据类路径的jar包依赖为当前项目进行自动配置
 * 3. @ComponentScan: 自动扫描当前包及子包下所有的类，将有@Component的类注册成bean，当然包括@Component下的子注解@Service,@Repository,@Controller
 * */
@SpringBootApplication
@Slf4j  //lombok提供的slf4j日志
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
        log.info("服务器启动成功");
    }
}

package com.jd.springbootdemo.controller;

import com.jd.springbootdemo.model.HelloModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Author: luojian
 * @Description: RESTful API测试
 * @Date: Created in 11:42 2018/8/3
 * @Modified By:
 */

/**
 * @RestController 是 @Controller 和 @ResponseBody 的组合注解
 * 1. @Controller：Controller标记的类就是一个控制器，这个类中的方法就是相应的动作，
 *    单独使用该注解返回的是jsp、html等视图页面。
 * 2. @ResponseBody: 表示该方法的返回的结果直接写入 HTTP 响应正文（ResponseBody）中，
 *    在返回的数据不是html标签的页面，而是其他某种格式的数据时（如json、xml等）使用。
 */
@RestController
@RequestMapping("/test")
@Slf4j
/**
 * 允许跨域注解
 */
@CrossOrigin
public class HelloController {
    /**
     * @RequestMapping 是处理请求地址映射的注解，有以下6个属性
     * 1. value：指定匹配的url或者路由
     * 2. method：指定请求的方法：GET、POST、PUT、DELETE等
     * 3. consumes：指定请求的提交内容类型，如 application/json、text/html等
     * 4. produces: 指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回
     * 5. params：指定request中必须包含某些参数值
     * 6. headers：指定request中必须包含某些指定的header值
     */

    /**
     *http协议的Request Payload 和 Form Data 的区别:https://www.cnblogs.com/xuzhudong/p/8487119.html
     * 直接通过形参接收参数
     * 该方式适用于get请求，post请求需要以Form Data的形式请求方可成功
     * 请求示例：http://localhost:8080/test/hello1?name=luojian&age=23
     */
    @RequestMapping(value = "/hello", method = {RequestMethod.POST, RequestMethod.GET})
    public HelloModel get(String name, int age){
        log.info("收到请求参数name: " + name);
        log.info("收到请求参数age: " + age);
        HelloModel model = new HelloModel();
        model.setName(name);
        model.setAge(age);
        return model;
    }

    /**
     * 用注解@RequestParam绑定请求参数到方法入参
     * get/post请求均可成功，post请求需要以Form Data的形式请求方可成功
     * 请求示例：http://localhost:8080/test/hello1?name=luojian&age=23
     */
    @RequestMapping(value = "/hello1", params = {"name", "age"} )
    public HelloModel get1(@RequestParam("name") String name, @RequestParam("age") int age){
        log.info("1收到请求参数name: " + name);
        log.info("1收到请求参数age: " + age);
        HelloModel model = new HelloModel();
        model.setName(name);
        model.setAge(age);
        return model;
    }

    /**
     * 通过HttpServletRequest对象获取参数及请求的其他信息
     * 支持get请求
     * post请求需要以Form Data的形式提交参数
     */
    @RequestMapping(value = "/hello2")
    public HelloModel get2(HttpServletRequest request){
        String method = request.getMethod();
        log.info("2收到的请求方法" + method);
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        log.info("2收到请求参数name: " + name);
        log.info("2收到请求参数age: " + age);
        int age1 = Integer.parseInt(age);    //String转int
        HelloModel model = new HelloModel();
        model.setName(name);
        model.setAge(age1);
        return model;
    }

    /**
     * 通过一个bean来封装接收的参数
     * get请求正确，post请求需设置'Content-Type':'application/x-www-form-urlencoded; charset=UTF-8'
     * 即将post请求的参数以Form Data的形式传输,请求正文是类似 get 请求 url 的请求参数，axios需要使用qs模块序列化传输的数据
     */
    @RequestMapping(value = "/hello3", method = {RequestMethod.GET, RequestMethod.POST})
    public HelloModel get3(HelloModel model){
        String name = model.getName();
        int age = model.getAge();
        log.info("3收到请求参数name: " + name);
        log.info("3收到请求参数age: " + age);
        return model;
    }

    /**
     * @RequestBody 不支持get请求，获取post请求中body的内容
     * 使用Map类型也不支持get请求，因为Map类型需要请求正文是一个json格式的字符串
     * post请求需要以Request Payload的形式传递参数才能成功，因为Request Payload请求的请求正文是一个json格式的字符串
     * axios、superagent默认以Request Payload的形式，可以正确请求，$.post()则以Form Data形式，请求失败
     */
    @RequestMapping(value = "/hello4")
    @ResponseBody
    public Map post(@RequestBody Map<String, Object> map){
        log.info("4收到请求参数name: " + map.get("name"));
        log.info("4收到请求参数name: " + map.get("age"));
        return map;
    }

}

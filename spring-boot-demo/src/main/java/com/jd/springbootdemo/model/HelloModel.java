package com.jd.springbootdemo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: luojian
 * @Description: 测试数据实体类，或者bean类
 * @Date: Created in 12:06 2018/8/3
 * @Modified By:
 */

/**
 * lombok的注解，自动生成类的getter、setter、toString方法以及无参构造函数，使该类满足生成bean的条件
 */
@Getter
@Setter
@ToString
public class HelloModel {
    private String name;
    private int age;
}

package com.MikeLC7.demo.simple;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project:
 *
 * File: TestMainClass
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/12 上午 11:13
 *
 * Copyright ( c ) 2018
 *
 */
public class TestMainClass {

    @Test
    public void demo1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        DateClass dateClass = (DateClass) context.getBean("dateBean");
        dateClass.printData();
    }




}

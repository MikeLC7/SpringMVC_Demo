package com.MikeLC7.demo.annotation;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Project:
 *
 * File: DemoController
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/12 上午 10:58
 *
 * Copyright ( c ) 2018
 *
 */
@Controller
@RequestMapping("/demo2Controller")
public class Demo2Controller{

    @RequestMapping("/demo1")
    public void demo1(){
        System.out.println("Demo2Controller_demo1");
    }


}

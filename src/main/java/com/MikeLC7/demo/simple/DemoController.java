package com.MikeLC7.demo.simple;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

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
public class DemoController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("DemoController_handleRequest");
        return null;
    }
}

package com.mmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author:
 * @data: 2018/12/12 22:28
 * @description:
 * @Version: 1.0
 **/
@Controller("myController")
@RequestMapping("/my")
public class MyController {
    @RequestMapping("/index")
    public ModelAndView getView(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
}

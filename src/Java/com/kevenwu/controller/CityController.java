package com.kevenwu.controller;

import com.kevenwu.service.CityService;
import com.kevenwu.service.impl.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityServiceImpl cityService;

    @RequestMapping("/getcityname")
    public ModelAndView hello(ModelAndView mv,@RequestParam String id){
        String name=cityService.getCityName(id);
        mv.addObject("cityname",name);
        mv.setViewName("cityname");
        return mv;
    }
}

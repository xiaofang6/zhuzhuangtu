package com.fxf.zhuzhuangtu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class OneController {

    @RequestMapping("/demo")
    public String myDemo(Model model){
        return "demo";
    }

}

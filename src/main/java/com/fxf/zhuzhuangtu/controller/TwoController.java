package com.fxf.zhuzhuangtu.controller;

import com.fxf.zhuzhuangtu.entity.People;
import com.fxf.zhuzhuangtu.service.IChartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("echarts")
public class TwoController {

    @Autowired
    private IChartsService iChartsService;

    /**
     *跳转到图表展示
     * @return
     */
    @RequestMapping("/toCharts")
    public String toCharts(){
        return "jsp/echarts/echarts";
    }

    @RequestMapping
    public String demo1(){
        return "demo1";
    }

    @RequestMapping("/getList")
    @ResponseBody
    public List<People> getList(){
        List<People> list = iChartsService.getList();
        return list;
    }

}

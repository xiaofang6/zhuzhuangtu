package com.fxf.zhuzhuangtu.service;

import com.fxf.zhuzhuangtu.dao.ChartsMapper;
import com.fxf.zhuzhuangtu.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChartsServiceImpl implements IChartsService {
    @Autowired
    private ChartsMapper chartsMapper;

    public List<People> getList(){
        List<People> charts = chartsMapper.getList();
        return charts;
    }
}

package com.fxf.zhuzhuangtu.dao;

import com.fxf.zhuzhuangtu.entity.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Mapper
public interface ChartsMapper{
    @Select("select * from people")
    List<People> getList();
}

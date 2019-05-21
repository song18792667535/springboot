package com.qf.dao;

import com.qf.pojo.Good;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodDao {
    @Select("select * from goods")
    public List<Good> getAllGoods();
}

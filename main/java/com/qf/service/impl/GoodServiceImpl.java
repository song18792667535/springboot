package com.qf.service.impl;

import com.qf.dao.GoodDao;
import com.qf.pojo.Good;
import com.qf.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {
    @Resource
    GoodDao goodDao;
    public List<Good> getAllGoods() {
        return goodDao.getAllGoods();
    }
}

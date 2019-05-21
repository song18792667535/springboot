package com.qf.controller;

import com.qf.pojo.Good;
import com.qf.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class GoodController {
    @Autowired
    GoodService goodService;
    @RequestMapping("aaa")
    public String getAllGoods(Model model){
        List<Good> list=goodService.getAllGoods();
        model.addAttribute("list",list);
        return "index";
    }
}

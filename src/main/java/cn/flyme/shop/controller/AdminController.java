package cn.flyme.shop.controller;

import cn.flyme.shop.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AdminController {

    @Autowired
    AdminService service;

    @RequestMapping("/a")
    public String get() {
        return "abc";
    }

    @RequestMapping("/abc/all")
    public String getAll(Integer index, Integer size) {
//        return new ModelAndView("admin","pager",service.getAll(index,size));
        return "abc";
    }
}

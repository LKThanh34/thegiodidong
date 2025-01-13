package com.lekimthanh.thegioididong.Controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lekimthanh.thegioididong.service.CategoryService;

@Controller
@RequestMapping("admin/categories")
public class CategoryAdminController {

    @Autowired
    CategoryService categoryService;

    public String add(Model model){
        
    }
}

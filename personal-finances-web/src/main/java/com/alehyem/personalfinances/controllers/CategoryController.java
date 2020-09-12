package com.alehyem.personalfinances.controllers;

import com.alehyem.personalfinances.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/categories")
@Controller
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String listOfCategories(Model model) {

        model.addAttribute("categories", categoryService.findAll());

        return "categories/index";
    }
}

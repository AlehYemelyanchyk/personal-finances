package com.alehyem.personalfinances.controllers;

import com.alehyem.personalfinances.services.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/incomes")
@Controller
public class IncomeController {

    private final IncomeService incomeService;

    @Autowired
    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String returnIndexPage() {
        return "incomes/index";
    }
}

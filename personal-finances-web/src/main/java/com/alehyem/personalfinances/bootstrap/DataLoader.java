package com.alehyem.personalfinances.bootstrap;

import com.alehyem.personalfinances.model.Category;
import com.alehyem.personalfinances.model.Income;
import com.alehyem.personalfinances.services.CategoryService;
import com.alehyem.personalfinances.services.IncomeService;
import com.alehyem.personalfinances.services.map.CategoryServiceMap;
import com.alehyem.personalfinances.services.map.IncomeServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final CategoryService categoryService;
    private final IncomeService incomeService;

    public DataLoader() {
        categoryService = new CategoryServiceMap();
        incomeService = new IncomeServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Category category1 = new Category();
        category1.setId(1L);
        category1.setName("Groceries");
        category1.setExpense(234.5);
        category1.setImportance("high");

        categoryService.save(category1);

        Category category2 = new Category();
        category2.setId(2L);
        category2.setName("Eating out");
        category2.setExpense(120.6);
        category2.setImportance("low");

        categoryService.save(category2);

        System.out.println("Loaded categories");

        Income income1 = new Income();
        income1.setId(1L);
        income1.setName("Salary");
        income1.setCurrency("USD");

        Income income2 = new Income();
        income2.setId(2L);
        income2.setName("Cash back");
        income2.setCurrency("BYN");

        System.out.println("Loaded incomes");
    }
}

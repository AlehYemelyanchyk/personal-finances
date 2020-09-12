package com.alehyem.personalfinances.services.map;

import com.alehyem.personalfinances.model.Category;
import com.alehyem.personalfinances.services.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CategoryServiceMap extends AbstractMapService<Category, Long> implements CategoryService {
    @Override
    public Set<Category> findAll() {
        return super.findAll();
    }

    @Override
    public Category findByName(String name) {
        return null;
    }

    @Override
    public Category findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Category save(Category object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Category object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

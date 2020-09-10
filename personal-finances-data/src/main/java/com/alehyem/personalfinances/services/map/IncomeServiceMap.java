package com.alehyem.personalfinances.services.map;

import com.alehyem.personalfinances.model.Income;
import com.alehyem.personalfinances.services.IncomeService;

import java.util.Set;

public class IncomeServiceMap extends AbstractMapService<Income, Long> implements IncomeService {
    @Override
    public Set<Income> findAll() {
        return super.findAll();
    }

    @Override
    public Income findByName(String name) {
        return null;
    }

    @Override
    public Income findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Income save(Income object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Income object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

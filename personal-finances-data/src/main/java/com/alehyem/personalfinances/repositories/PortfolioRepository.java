package com.alehyem.personalfinances.repositories;

import com.alehyem.personalfinances.model.Portfolio;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface PortfolioRepository extends CrudRepository<Portfolio, Long> {

    @Override
    Collection<Portfolio> findAll();
}

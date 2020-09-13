package com.alehyem.personalfinances.repositories;

import com.alehyem.personalfinances.model.Portfolio;
import org.springframework.data.repository.CrudRepository;

public interface PortfolioRepository extends CrudRepository<Portfolio, Long> {
}

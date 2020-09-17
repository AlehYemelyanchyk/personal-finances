package com.alehyem.personalfinances.services.impl;

import com.alehyem.personalfinances.model.Portfolio;
import com.alehyem.personalfinances.repositories.PortfolioRepository;
import com.alehyem.personalfinances.services.PortfolioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class JpaPortfolioService implements PortfolioService {

    private final PortfolioRepository portfolioRepository;

    public JpaPortfolioService(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    @Override
    public Set<Portfolio> findAll() {
        Collection<Portfolio> allPortfolios = portfolioRepository.findAll();
        return new HashSet<>(allPortfolios);
    }

    @Override
    public Portfolio findById(Long id) {
        return portfolioRepository.findById(id).orElse(null);
    }

    @Override
    public Portfolio save(Portfolio object) {
        return portfolioRepository.save(object);
    }

    @Override
    public void delete(Portfolio object) {
        portfolioRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        portfolioRepository.deleteById(id);
    }
}

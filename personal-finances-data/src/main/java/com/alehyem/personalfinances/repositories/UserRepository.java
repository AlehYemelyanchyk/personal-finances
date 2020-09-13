package com.alehyem.personalfinances.repositories;

import com.alehyem.personalfinances.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    Collection<User> findAll();

    @Override
    Optional<User> findById(Long aLong);
}

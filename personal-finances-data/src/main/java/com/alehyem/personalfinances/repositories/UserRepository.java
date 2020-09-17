package com.alehyem.personalfinances.repositories;

import com.alehyem.personalfinances.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    Collection<User> findAll();
}

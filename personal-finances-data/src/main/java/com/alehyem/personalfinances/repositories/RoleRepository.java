package com.alehyem.personalfinances.repositories;

import com.alehyem.personalfinances.model.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface RoleRepository extends CrudRepository<Role, Long> {

    @Override
    Collection<Role> findAll();
}

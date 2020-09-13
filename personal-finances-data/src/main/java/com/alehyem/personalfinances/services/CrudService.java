package com.alehyem.personalfinances.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();

    T findByName(String name);

    T findById(ID id);

    T save(T object);

    void delete (T object);

    void deleteById (ID id);
}
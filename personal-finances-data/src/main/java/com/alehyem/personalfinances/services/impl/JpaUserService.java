package com.alehyem.personalfinances.services.impl;

import com.alehyem.personalfinances.model.User;
import com.alehyem.personalfinances.repositories.UserRepository;
import com.alehyem.personalfinances.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class JpaUserService implements UserService {

    private final UserRepository userRepository;

    public JpaUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Set<User> findAll() {
        Collection<User> allUsers = userRepository.findAll();
        return new HashSet<>(allUsers);
    }

    @Override
    public User findByName(String name) {
        return null;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User save(User object) {
        return userRepository.save(object);
    }

    @Override
    public void delete(User object) {
        userRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}

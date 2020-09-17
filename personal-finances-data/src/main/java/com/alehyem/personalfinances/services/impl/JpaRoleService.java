package com.alehyem.personalfinances.services.impl;

import com.alehyem.personalfinances.model.Role;
import com.alehyem.personalfinances.repositories.RoleRepository;
import com.alehyem.personalfinances.services.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class JpaRoleService implements RoleService {

    private final RoleRepository roleRepository;

    public JpaRoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Set<Role> findAll() {
        Collection<Role> allRoles = roleRepository.findAll();
        return new HashSet<>(allRoles);
    }

    @Override
    public Role findById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public Role save(Role object) {
        return roleRepository.save(object);
    }

    @Override
    public void delete(Role object) {
        roleRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        roleRepository.deleteById(id);
    }
}

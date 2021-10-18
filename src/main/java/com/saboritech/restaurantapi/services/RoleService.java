package com.saboritech.restaurantapi.services;

import com.saboritech.restaurantapi.models.ERole;
import com.saboritech.restaurantapi.models.Role;
import com.saboritech.restaurantapi.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RoleRepository dao;

    public Optional<Role> findByName(ERole name){
        System.out.println(dao.findAll());
        return dao.findByName(name);
    }
}

package com.saboritech.restaurantapi.repositories;

import com.saboritech.restaurantapi.models.ERole;
import com.saboritech.restaurantapi.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer> {

    Optional<Role> findByName(ERole name);
}

package com.saboritech.restaurantapi.services;

import com.saboritech.restaurantapi.models.User;
import com.saboritech.restaurantapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepository dao;

    public Boolean existsByUsername(String username){
        return dao.existsByUsername(username);
    }

    public void save(User user){
        dao.saveAndFlush(user);
    }

    public void saveUsers(Set<User> users){
        dao.saveAll(users);
    }

    public Optional<User> findById(Integer id){
        return dao.findById(id);
    }

    public List<User> findAll(){ return dao.findAll();}

}

package com.jdavi.jplace.service.impl;

import com.jdavi.jplace.data.model.User;
import com.jdavi.jplace.data.repository.UserRepository;
import com.jdavi.jplace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User save(User user) {
        return repository.save( user );
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findOne(Long id) {
        return repository.findById(id).isPresent()? repository.findById(id).get() : null;
    }
}

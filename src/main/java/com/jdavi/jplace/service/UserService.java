package com.jdavi.jplace.service;

import com.jdavi.jplace.data.model.User;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> findAll();

    User findOne(Long id);
}

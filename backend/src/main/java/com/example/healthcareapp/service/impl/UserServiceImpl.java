package com.example.healthcareapp.service.impl;

import com.example.healthcareapp.model.User;
import com.example.healthcareapp.repository.UserRepository;
import com.example.healthcareapp.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }
}

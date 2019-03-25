package com.gradle.springboot.manager.service;

import com.gradle.springboot.entity.User;
import com.gradle.springboot.manager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/3/25 14:39
 **/
@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public User findMaxIdUser(){
        return repository.findMaxIdUser();
    }
}

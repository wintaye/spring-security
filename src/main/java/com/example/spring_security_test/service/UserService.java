package com.example.spring_security_test.service;

import com.example.spring_security_test.dto.UserRegistrationDto;
import com.example.spring_security_test.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
    List<User> getAll();
}

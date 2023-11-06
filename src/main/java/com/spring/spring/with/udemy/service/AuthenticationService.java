package com.spring.spring.with.udemy.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String userName, String password) {
        boolean isValidName = userName.equalsIgnoreCase("wlgjs0606");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");
        return isValidName && isValidPassword;
    }
}

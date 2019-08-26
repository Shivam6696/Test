package com.example.demo.app;


import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean validateUser(String userid, String password) {
    
        return userid.equalsIgnoreCase("Shivam") && password.equalsIgnoreCase("xyz");
    }
}
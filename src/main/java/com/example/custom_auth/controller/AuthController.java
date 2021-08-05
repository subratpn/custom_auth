package com.example.custom_auth.controller;

import com.example.custom_auth.dto.LoginRequest;
import com.example.custom_auth.dto.LoginResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        //validate the username
        //validate the security questions
        //generate JWT
        //return
        return new LoginResponse();
    }
}

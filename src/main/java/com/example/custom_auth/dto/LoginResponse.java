package com.example.custom_auth.dto;

import lombok.Data;

@Data
public class LoginResponse {

    private String username;

    private String token;

}

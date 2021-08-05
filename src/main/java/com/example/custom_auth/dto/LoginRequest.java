package com.example.custom_auth.dto;

import lombok.Data;

import java.util.List;

@Data
public class LoginRequest {

    private int phone;

    private List<SecretQuestionsDTO> secretQuestions;
}

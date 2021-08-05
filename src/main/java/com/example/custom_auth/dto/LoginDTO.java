package com.example.custom_auth.dto;

import lombok.Data;

import java.util.List;

@Data
public class LoginDTO {

    private int phone;

    private List<SecretQuestionsDTO> secretQuestions;
}

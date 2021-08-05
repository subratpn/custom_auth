package com.example.custom_auth.security;

import com.example.custom_auth.dto.LoginDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

@Slf4j
public class LoginFilter extends OncePerRequestFilter {

    private static ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String requestBody = httpServletRequest.getReader().lines().collect(Collectors.joining());
        log.info("Request Body :  {} ", requestBody);
        final LoginDTO loginDTO = objectMapper.readValue(requestBody, LoginDTO.class);
        log.info("LOGIN DTO : {}", loginDTO);
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}

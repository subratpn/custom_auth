package com.example.custom_auth.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.util.matcher.RequestMatcher;

@Configuration
public class Config {

    @Bean
    RequestMatcher loginURLMatcher() {
        return httpServletRequest -> httpServletRequest.getRequestURI().endsWith("login");
    }
}

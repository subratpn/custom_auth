package com.example.custom_auth.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class GenericAuthFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        log.info("Generic Auth Filter");
        //TODO:Write Logic Here to Validate JWT TOKEN
        //once verified that token is valid, then set user info in SecurityContext
        //else reject request with 401
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
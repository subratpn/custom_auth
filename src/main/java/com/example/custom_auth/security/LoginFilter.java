package com.example.custom_auth.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

@Slf4j
@Component
public class LoginFilter extends AbstractAuthenticationProcessingFilter {

    protected LoginFilter(RequestMatcher loginURLMatcher) {
        super(loginURLMatcher);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws AuthenticationException, IOException, ServletException {
        String requestBody = httpServletRequest.getReader().lines().collect(Collectors.joining());
        log.info("Request Body :  {} ", requestBody);
        return null;
    }

}

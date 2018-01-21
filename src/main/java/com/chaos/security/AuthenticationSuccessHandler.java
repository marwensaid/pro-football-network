package com.chaos.security;

import com.chaos.entities.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@Component
public class AuthenticationSuccessHandler implements org.springframework.security.web.authentication.AuthenticationSuccessHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationSuccessHandler.class);
    private ObjectMapper mapper;

    @Autowired
    public AuthenticationSuccessHandler(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);

        SecurityUser userDetails = (SecurityUser) authentication.getPrincipal();
        User user = userDetails.getDomainUser();

        LOGGER.info(userDetails.getUsername() + " got is connected ");

        PrintWriter writer = httpServletResponse.getWriter();
        mapper.writeValue(writer, user);
        writer.flush();
    }
}

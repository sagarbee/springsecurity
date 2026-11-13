package com.springsecurity.controller;

import com.springsecurity.model.AuthenticatedUser;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checksecurity")
public class secureController {

    @GetMapping
    public String checkEndpointSecurity(){
        AuthenticatedUser user =(AuthenticatedUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "Hi "+ user.getUsername();
    }

}

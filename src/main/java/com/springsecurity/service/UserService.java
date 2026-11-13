package com.springsecurity.service;

import com.springsecurity.dto.UserDTO;
import com.springsecurity.entity.User;
import com.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(UserDTO userDTO){
        User u = new User();
        u.setEmail(userDTO.getEmail());
        u.setUsername(userDTO.getUsername());
        u.setPassword(userDTO.getPassword());
        return  userRepository.save(u);
    }


}

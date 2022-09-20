package com.exercise.lab48.service.security;

import com.exercise.lab48.config.CustomUserDetails;
import com.exercise.lab48.model.security.User;
import com.exercise.lab48.repository.security.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user =  userRepository.findByUsername(username);

        if (!user.isPresent()) {
            throw new UsernameNotFoundException("User " + username + " not found");
        }

        CustomUserDetails userDetails = new CustomUserDetails();
        userDetails.setUser(user.get());

        return userDetails;
    }
}
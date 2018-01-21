package com.profootballnetwork.security;

import com.profootballnetwork.entities.User;
import com.profootballnetwork.interfacesRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;



@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        System.out.println("Email: " + email + ", User: " + user);
        if (user == null) throw new UsernameNotFoundException("User not found");
        return new SecurityUser(user);
    }
}

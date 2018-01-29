/**
 *
 */
package com.profootballnetwork.blog.services;

import com.profootballnetwork.blog.entities.User;
import com.profootballnetwork.blog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author msaidi
 */
@Service
@Transactional
public class UserService {

    @Autowired
	UserRepository userRepository;

    public User login(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

}

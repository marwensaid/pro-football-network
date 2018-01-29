package com.profootballnetwork.blog.repositories;

import com.profootballnetwork.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author msaidi
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);

    User findByEmailAndPassword(String email, String password);

}

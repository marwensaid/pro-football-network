package com.profootballnetwork.interfacesRepository;

import com.profootballnetwork.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by marwen.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmailAndPassword(String email, String password);
    User findByEmail(String email);

}

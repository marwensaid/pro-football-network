package com.profootballnetwork.blog.repositories;

import com.profootballnetwork.blog.entities.EmailSubscriber;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author msaidi
 */
public interface EmailSubscriberRepository extends JpaRepository<EmailSubscriber, Integer> {

    EmailSubscriber findByEmail(String email);

}

package com.profootballnetwork.interfacesRepository;

import com.profootballnetwork.entities.EmailSubscriber;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by marwen .
 */
public interface EmailSubscriberRepository extends JpaRepository<EmailSubscriber, Integer> {

    EmailSubscriber findByEmail(String email);

}

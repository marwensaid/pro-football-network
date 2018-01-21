package com.profootballnetwork.interfacesRepository;

import com.profootballnetwork.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by marwen.
 */
public interface TagRepository extends JpaRepository<Tag, Integer> {
}

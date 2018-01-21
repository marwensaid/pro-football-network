package com.chaos.interfacesRepository;

import com.chaos.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by marwen.
 */
public interface TagRepository extends JpaRepository<Tag, Integer> {
}

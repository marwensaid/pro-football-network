package com.chaos.interfacesRepository;

import com.chaos.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by marwen.
 */
public interface PostRepository extends JpaRepository<Post, Integer> {
}

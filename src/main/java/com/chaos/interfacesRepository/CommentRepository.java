package com.chaos.interfacesRepository;

import com.chaos.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by marwen
 */
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}

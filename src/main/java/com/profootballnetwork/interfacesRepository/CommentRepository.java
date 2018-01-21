package com.profootballnetwork.interfacesRepository;

import com.profootballnetwork.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by marwen
 */
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}

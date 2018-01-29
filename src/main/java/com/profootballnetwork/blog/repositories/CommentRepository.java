package com.profootballnetwork.blog.repositories;

import com.profootballnetwork.blog.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author msaidi
 */
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}

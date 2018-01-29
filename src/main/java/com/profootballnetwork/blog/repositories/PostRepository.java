package com.profootballnetwork.blog.repositories;

import com.profootballnetwork.blog.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author msaidi
 */
public interface PostRepository extends JpaRepository<Post, Integer> {

}

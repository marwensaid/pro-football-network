package com.profootballnetwork.blog.repositories;

import com.profootballnetwork.blog.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author msaidi
 */
public interface TagRepository extends JpaRepository<Tag, Integer> {

}

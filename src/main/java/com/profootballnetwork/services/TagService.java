package com.profootballnetwork.services;

import com.profootballnetwork.entities.Tag;
import com.profootballnetwork.interfacesRepository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service
@Transactional
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    public List<Tag> findAllTags() {
        return tagRepository.findAll();
    }

    public Tag createTag(Tag tag) {
        return tagRepository.save(tag);
    }
}

package com.profootballnetwork.blog.rest.endpoints.admin;

import com.profootballnetwork.blog.entities.Tag;
import com.profootballnetwork.blog.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author msaidi
 */
@RestController
@RequestMapping(value = "/api/admin")
public class TagsRestController {
    @Autowired
    private TagService tagService;

    @RequestMapping(value = "/tags", method = RequestMethod.POST)
    public Tag createTag(@RequestBody Tag tag) {
        return tagService.createTag(tag);
    }
}

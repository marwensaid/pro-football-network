package com.profootballnetwork.blog.rest.endpoints.admin;

import com.profootballnetwork.blog.rest.model.CommentsResponseDTO;
import com.profootballnetwork.blog.entities.Comment;
import com.profootballnetwork.blog.rest.model.PostsRequestDTO;
import com.profootballnetwork.blog.services.BlogService;
import com.profootballnetwork.blog.services.EmailService;
import com.profootballnetwork.blog.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

/**
 * @author msaidi
 */
@RestController
@RequestMapping(value = "/api/admin")
public class CommentsRestController {
    private final static Logger LOGGER = LoggerFactory.getLogger(CommentsRestController.class);
    @Autowired
    EmailService emailService;
    @Autowired
    private UserService userService;
    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    public CommentsResponseDTO findComments(PostsRequestDTO request) //TODO;
    {
        Page<Comment> pageData = blogService.findComments(request);
        CommentsResponseDTO commentsResponse = new CommentsResponseDTO(pageData);
        return commentsResponse;
    }

    @RequestMapping(value = "/comments/{commentId}", method = RequestMethod.DELETE)
    public void deleteCommentById(@PathVariable(value = "commentId") Integer commentId) {
        LOGGER.debug("Delete comment id: " + commentId);
        blogService.deleteComment(commentId);
    }

    @RequestMapping(value = "/comments", method = RequestMethod.DELETE)
    public void deleteComments(@RequestParam(value = "commentIds") String commentIds) {
        LOGGER.debug("Delete comment ids: " + commentIds);
        String[] ids = commentIds.split(",");
        for (String strId : ids) {
            blogService.deleteComment(Integer.parseInt(strId));
        }

    }

}

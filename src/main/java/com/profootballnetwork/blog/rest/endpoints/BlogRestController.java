package com.profootballnetwork.blog.rest.endpoints;

import com.profootballnetwork.blog.entities.EmailSubscriber;
import com.profootballnetwork.blog.entities.Post;
import com.profootballnetwork.blog.repositories.EmailSubscriberRepository;
import com.profootballnetwork.blog.rest.model.PostsRequestDTO;
import com.profootballnetwork.blog.rest.model.PostsResponseDTO;
import com.profootballnetwork.blog.services.BlogService;
import com.profootballnetwork.blog.services.EmailService;
import com.profootballnetwork.blog.services.TagService;
import com.profootballnetwork.blog.entities.Comment;
import com.profootballnetwork.blog.entities.Tag;
import com.profootballnetwork.blog.services.UserService;
import com.profootballnetwork.blog.utils.BeanCopyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author msaidi
 */
@RestController
@RequestMapping(value = "/api")
public class BlogRestController {
    private final static Logger LOGGER = LoggerFactory.getLogger(BlogRestController.class);
    @Autowired
    EmailService emailService;
    @Autowired
    private UserService userService;
    @Autowired
    private TagService tagService;
    @Autowired
    private BlogService blogService;
    @Autowired
    private EmailSubscriberRepository emailSubscriberRepository;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public PostsResponseDTO findPosts(PostsRequestDTO request) {
        Page<Post> pageData = blogService.findPosts(request);
        PostsResponseDTO postsResponse = new PostsResponseDTO(pageData);
        return postsResponse;
    }

    @RequestMapping(value = "/posts/{postId}", method = RequestMethod.GET)
    public Post findPostById(@PathVariable(value = "postId") Integer postId) {
        LOGGER.debug("View Post id: " + postId);
        Post post = blogService.findPostById(postId);
        Post postCopy = BeanCopyUtils.copy(post);
        List<Comment> comments = post.getComments();
        for (Comment comment : comments) {
            postCopy.getComments().add(BeanCopyUtils.copy(comment));
        }
        return postCopy;
    }

    @RequestMapping(value = "/posts/{postId}/comments", method = RequestMethod.POST)
    public Comment addComment(@PathVariable(value = "postId") Integer postId, @RequestBody Comment comment) {
        comment.setPost(new Post(postId));
        Comment createdComment = blogService.createComment(comment);
        String subject = "New Comment on [" + comment.getPost().getTitle() + "] published";
        String content = "A new post with title \"" + comment.getPost().getTitle() + "\" is published.\nThanks,\nSiva";
        emailService.sendEmail(subject, content);
        return createdComment;
    }

    @RequestMapping(value = "/tags", method = RequestMethod.GET)
    public List<Tag> findAllTags() {
        return tagService.findAllTags();
    }

    @RequestMapping(value = "/emailSubscribers", method = RequestMethod.POST)
    public EmailSubscriber createEmailSubscriber(@RequestBody EmailSubscriber subscriber) {
        return emailSubscriberRepository.save(subscriber);
    }
}

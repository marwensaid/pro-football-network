/**
 *
 */
package com.profootballnetwork.blog;

import com.profootballnetwork.blog.entities.Post;
import com.profootballnetwork.blog.rest.model.PostsRequestDTO;
import com.profootballnetwork.blog.services.BlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author Siva
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProFootballNetworkApplication.class)
@WebAppConfiguration
public class ProFootballNetworkApplicationTests {

    @Autowired
    private BlogService blogService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test_findPosts() {
        PostsRequestDTO postsRequest = new PostsRequestDTO();
        Page<Post> posts = blogService.findPosts(postsRequest);
        System.out.println(posts);
    }
}

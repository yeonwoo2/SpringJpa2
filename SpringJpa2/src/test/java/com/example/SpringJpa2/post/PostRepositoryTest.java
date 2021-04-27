package com.example.SpringJpa2.post;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Test
    public void crud(){
        Post post = new Post();
        post.setTitle("hibernate");

        Assertions.assertThat(postRepository.contains(post)).isFalse();
        postRepository.save(post);

        Assertions.assertThat(postRepository.contains(post)).isTrue();
        postRepository.delete(post);
        postRepository.flush();
    }
}
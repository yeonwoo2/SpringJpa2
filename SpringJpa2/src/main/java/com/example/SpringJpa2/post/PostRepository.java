package com.example.SpringJpa2.post;

import com.example.SpringJpa2.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends MyRepository<Post, Long> {
}

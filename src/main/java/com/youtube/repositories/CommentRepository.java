package com.youtube.repositories;

import com.youtube.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends JpaRepository<Comment, String> {
}

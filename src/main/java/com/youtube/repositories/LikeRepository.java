package com.youtube.repositories;

import com.youtube.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, String> {
}

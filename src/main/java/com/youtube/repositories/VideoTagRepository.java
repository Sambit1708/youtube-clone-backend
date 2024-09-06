package com.youtube.repositories;


import com.youtube.model.VideoTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoTagRepository extends JpaRepository<VideoTag, String> {
}

package com.youtube.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video {

    @Id
    private String id;
    private String title;
    private String description;
    private String userId;
    private Integer likes;
    private Integer disLikes;
//    private Set<String> tags;
    private String videoUrl;
    private VideoStatus videoStatus;
    private Integer ViewCount;
    private String thumbnailUrl;
//    private List<Comment> commentList;
}

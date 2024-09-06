package com.youtube.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "comments")
public class Comment extends BaseEntity {

    @Column(length = 500)
    private String commentText;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    private Video video;

    private Integer dislikeCount;

    private Integer likeCount;
}

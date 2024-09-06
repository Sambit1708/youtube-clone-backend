package com.youtube.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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

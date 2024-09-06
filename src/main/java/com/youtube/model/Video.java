package com.youtube.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;

@Data
@Entity
@Table(name = "videos")
public class Video extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User user;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private String videoUrl;

    @Column
    private String thumbnailUrl;

    @Column
    private Long views = 0L;

    @Column
    private Integer duration;

    @Enumerated(EnumType.STRING)
    private VideoStatus videoStatus;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "video")
    private List<Comment> comments;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "video")
    private List<Like> likes;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "video")
    private List<History> histories;
}

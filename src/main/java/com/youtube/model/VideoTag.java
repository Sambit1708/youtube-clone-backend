package com.youtube.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "video_tags")
public class VideoTag extends BaseEntity {

    private String tag;

    @ManyToOne(fetch = FetchType.EAGER)
    private Video video;
}

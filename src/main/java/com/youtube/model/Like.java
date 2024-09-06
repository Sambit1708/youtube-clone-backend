package com.youtube.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "likes")
public class Like extends BaseEntity {

    private boolean liked;

    @ManyToOne(fetch = FetchType.EAGER)
    private Video video;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
}

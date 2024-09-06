package com.youtube.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false, unique = true)
    private  String email;

    private String password;

    private String firstName;

    private String lastName;

    @Column(length = 500)
    private String profileImageUrl;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Video> videos;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Comment> comments;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Like> likes;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<History> histories;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "subscriber")
    private List<Subscription> subscribers;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "subscribedTo")
    private List<Subscription> subscribedTos;

}

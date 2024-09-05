package com.youtube.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @UuidGenerator
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
//    private Set<User> subscribedToUser;
//    private Set<String> subscribes;
//    private List<String> videoHistory;
//    private Set<String> likedVideos;
//    private Set<String> dislikedVideos;
}

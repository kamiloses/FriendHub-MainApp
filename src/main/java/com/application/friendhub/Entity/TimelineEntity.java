package com.application.friendhub.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TimelineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String author;

    private String uploadedUser;

    @Column(length = 1337)
    private String post;

    private String image;

    private Date dateOfPublication;

    @ManyToOne
    private UserEntity user;





   /* @ManyToMany(mappedBy = "likesEntity")
    @Column(name = "like_id")*/


    @OneToMany(mappedBy = "likeEntity",cascade = CascadeType.REMOVE)
    private List<LikesEntity> likesEntities;


    @OneToMany(mappedBy = "timelineEntity", cascade = CascadeType.REMOVE)
    private List<CommentsEntity> commentsEntity;



}

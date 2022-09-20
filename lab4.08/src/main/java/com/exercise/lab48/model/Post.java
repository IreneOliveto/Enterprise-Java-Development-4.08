package com.exercise.lab48.model;

import javax.persistence.*;

@Entity
@Table
public class Post {
    @Id
    @Column(name = "id_post")
    private Integer idPost;
    private String title;
    private Integer wordCount;
    @ManyToOne
    @JoinColumn(name="id_author")
    private Author author;

    public Post() {}

    public Post(Integer idPost, String title, Integer wordCount, Author author) {
        this.idPost = idPost;
        this.title = title;
        this.wordCount = wordCount;
        this.author = author;
    }

    public Integer getIdPost() {
        return idPost;
    }

    public void setIdPost(Integer idPost) {
        this.idPost = idPost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }
}

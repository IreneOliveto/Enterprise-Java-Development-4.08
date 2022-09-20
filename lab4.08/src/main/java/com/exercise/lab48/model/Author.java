package com.exercise.lab48.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAuthor;
    private String authorName;

    @OneToMany
    @JoinColumn(name="id_post")
    private List<Post> postsList;

    public Author() {}

    public Author(Integer idAuthor, String authorName, List<Post> postsList) {
        this.idAuthor = idAuthor;
        this.authorName = authorName;
        this.postsList = postsList;
    }

    public Integer getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}

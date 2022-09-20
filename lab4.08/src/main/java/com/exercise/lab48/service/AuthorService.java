package com.exercise.lab48.service;

import com.exercise.lab48.model.Author;

public interface AuthorService {

    Author getAuthorById(Integer idAuthor);
    Author addNewAuthor(Author author);
    Author updateAuthor(Author author);
    void deleteAuthor(Author author);
}

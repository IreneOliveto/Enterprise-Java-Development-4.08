package com.exercise.lab48.service;

import com.exercise.lab48.model.Author;
import com.exercise.lab48.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Author getAuthorById(Integer idAuthor) {
        return authorRepository.findById(idAuthor).get();
    }

    @Override
    public Author addNewAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(Author author) {
        authorRepository.delete(author);
    }


}

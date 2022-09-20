package com.exercise.lab48.controller;

import com.exercise.lab48.model.Author;
import com.exercise.lab48.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/author/{id_author}")
    public Author getAuthorById(@PathVariable(value="id_author") Integer idAuthor) {
        return authorService.getAuthorById(idAuthor);
    }

    @PostMapping("/author")
    public Author newAuthor(@RequestBody Author author) {
        return authorService.addNewAuthor(author);
    }

    @PutMapping("/author")
    public Author updateAuthor(@RequestBody Author author) {
        return authorService.updateAuthor(author);
    }

    @DeleteMapping("/author/")
    public void deleteAuthor(@RequestBody Author author) {
        authorService.deleteAuthor(author);
    }
}

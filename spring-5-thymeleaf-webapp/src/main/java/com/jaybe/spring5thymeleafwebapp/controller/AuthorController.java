package com.jaybe.spring5thymeleafwebapp.controller;

import com.jaybe.spring5thymeleafwebapp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    // add mapping for /GET - get all authors from db
    @GetMapping(path = "/authors")
    public String getAllAuthors(Model model) {

        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }

}

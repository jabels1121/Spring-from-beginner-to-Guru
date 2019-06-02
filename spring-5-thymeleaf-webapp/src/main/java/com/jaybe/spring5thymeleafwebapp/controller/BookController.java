package com.jaybe.spring5thymeleafwebapp.controller;

import com.jaybe.spring5thymeleafwebapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // add request mapping for /GET - get all books
    @GetMapping(path = "/books")
    public String getAllBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }

}

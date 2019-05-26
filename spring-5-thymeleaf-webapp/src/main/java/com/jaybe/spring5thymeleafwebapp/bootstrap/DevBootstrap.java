package com.jaybe.spring5thymeleafwebapp.bootstrap;

import com.jaybe.spring5thymeleafwebapp.entity.Author;
import com.jaybe.spring5thymeleafwebapp.entity.Book;
import com.jaybe.spring5thymeleafwebapp.repositories.AuthorRepository;
import com.jaybe.spring5thymeleafwebapp.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public DevBootstrap(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", "Harper Collins");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", "Worx");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.saveAll(Arrays.asList(eric, rod));
        bookRepository.saveAll(Arrays.asList(ddd, noEJB));
    }
}

package com.jaybe.spring5thymeleafwebapp.repository;

import com.jaybe.spring5thymeleafwebapp.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

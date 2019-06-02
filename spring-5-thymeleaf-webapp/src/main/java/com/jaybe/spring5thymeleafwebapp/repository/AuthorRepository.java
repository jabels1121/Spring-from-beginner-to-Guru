package com.jaybe.spring5thymeleafwebapp.repository;

import com.jaybe.spring5thymeleafwebapp.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}

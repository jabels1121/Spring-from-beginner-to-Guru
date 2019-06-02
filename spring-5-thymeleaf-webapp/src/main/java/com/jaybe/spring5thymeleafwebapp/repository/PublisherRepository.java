package com.jaybe.spring5thymeleafwebapp.repository;

import com.jaybe.spring5thymeleafwebapp.entity.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

package com.jaybe.spring5thymeleafwebapp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Data
@NoArgsConstructor
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String address;

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher)) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(getId(), publisher.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

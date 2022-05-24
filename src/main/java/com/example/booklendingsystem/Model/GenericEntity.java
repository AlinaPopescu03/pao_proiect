package com.example.booklendingsystem.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public abstract sealed class GenericEntity permits Books, Users, Parteners, Category, BookCategory, BookPartener,
BookLending, Prizes, BookPrize{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
}

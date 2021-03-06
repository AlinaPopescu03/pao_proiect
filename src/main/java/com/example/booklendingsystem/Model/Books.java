package com.example.booklendingsystem.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "books")
public non-sealed class Books extends GenericEntity {

    private String name;
    private String author;
    private int year;
    private Boolean availability;

    @OneToOne
    @JoinColumn(name="id")
    private Category category;

    @OneToOne
    @JoinColumn(name="id")
    private Parteners partener;

    @OneToOne
    @JoinColumn(name="id")
    private Prizes prize;

}


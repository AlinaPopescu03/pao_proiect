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
@Setter
@Getter
@Entity
@Table(name = "book_partener")
public non-sealed class BookPartener extends GenericEntity {

    @OneToOne
    @JoinColumn(name="books", nullable=false)
    private Books book;

    @OneToOne
    @JoinColumn(name="parteners", nullable=false)
    private Parteners partener;
}

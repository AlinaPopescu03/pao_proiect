package com.example.booklendingsystem.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "book_category")
public non-sealed class BookCategory extends GenericEntity {

//    @OneToOne
//    @JoinTable(name="books",
//            joinColumns = {@JoinColumn(name="id", referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn(name="id", referencedColumnName="id")} )
//    private Books books;

//    @OneToOne
//    @JoinTable(name="category",
//            joinColumns = {@JoinColumn(name="id", referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn(name="id", referencedColumnName="id")} )
    @Column(name="id_book")
    private Integer id_book;

    @Column(name="id_category")
    private Integer id_category;
}

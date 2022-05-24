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
@Table(name="book_prize")
 public non-sealed class BookPrize extends GenericEntity{
    @OneToOne
    @JoinColumn(name="books", nullable=false)
    private Books book;

    @ManyToOne
    @JoinColumn(name="prizes", nullable=false)
    private Prizes prize;
}

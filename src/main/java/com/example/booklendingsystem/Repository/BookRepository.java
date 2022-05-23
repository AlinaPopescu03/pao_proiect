package com.example.booklendingsystem.Repository;

import com.example.booklendingsystem.Model.Books;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Books, Integer> {

    @Query("select book from Books book where book.name=:name")
    Optional<Books> findBookByName(String name);
}


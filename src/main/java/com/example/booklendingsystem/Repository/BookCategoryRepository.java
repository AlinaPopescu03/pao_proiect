package com.example.booklendingsystem.Repository;

import com.example.booklendingsystem.Model.BookCategory;
import com.example.booklendingsystem.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer> {
    @Query("select book from BookCategory book where book.id=:id")
    Optional<BookCategory> findBookCategory(int id);
}

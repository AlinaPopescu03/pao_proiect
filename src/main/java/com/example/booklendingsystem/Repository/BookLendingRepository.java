package com.example.booklendingsystem.Repository;

import com.example.booklendingsystem.Model.BookLending;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookLendingRepository extends JpaRepository<BookLending, Integer> {
}

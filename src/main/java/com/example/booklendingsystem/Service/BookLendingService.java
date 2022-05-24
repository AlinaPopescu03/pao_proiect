package com.example.booklendingsystem.Service;


import com.example.booklendingsystem.Model.BookLending;
import com.example.booklendingsystem.Repository.BookLendingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookLendingService {
    private final BookLendingRepository bookLendingRepository;

    public void save(BookLending book) {
        bookLendingRepository.save(book);
    }

    public void saveBooks(List<BookLending> books){
        bookLendingRepository.saveAll(books);
    }

    public List<BookLending> getBooks(){
        return bookLendingRepository.findAll();
    }
//
////    public Books getBookbyId(int id){
////        return bookCategoryRepository.findById(id).orElse(null);
////    }
//
//    public String deleteBook(int id){
//        bookCategoryRepository.deleteById(id);
//        return " Cartea cu id-ul " + id + " nu mai are categorie in aplicatie!";
//    }
}

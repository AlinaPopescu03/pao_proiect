package com.example.booklendingsystem.Service;

import com.example.booklendingsystem.Model.BookCategory;
import com.example.booklendingsystem.Model.Books;
import com.example.booklendingsystem.Model.Category;
import com.example.booklendingsystem.Repository.BookCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class BookCategoryservice {

    private final BookCategoryRepository bookCategoryRepository;

    public void save(BookCategory book) {
        bookCategoryRepository.save(book);
    }

    public void saveBooks(List<BookCategory> books){
        bookCategoryRepository.saveAll(books);
    }

    public List<BookCategory> getBooks(){
        return bookCategoryRepository.findAll();
    }

//    public Books getBookbyId(int id){
//        return bookCategoryRepository.findById(id).orElse(null);
//    }

    public String deleteBook(int id){
        bookCategoryRepository.deleteById(id);
        return " Cartea cu id-ul " + id + " nu mai are categorie in aplicatie!";
    }

    public Optional<BookCategory> findBookbyId(int id) {
        return bookCategoryRepository.findBookCategory(id);
    }
}

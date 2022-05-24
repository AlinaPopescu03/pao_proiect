package com.example.booklendingsystem.Controller;

import com.example.booklendingsystem.Model.BookCategory;
import com.example.booklendingsystem.Model.Books;
import com.example.booklendingsystem.Service.BookCategoryservice;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("book-category")
public class BookCategoryController {
    private final BookCategoryservice bookCategoryservice;

    @PostMapping("/add")
    public void addBook(@RequestBody BookCategory book){
        bookCategoryservice.save(book);

    }

    @PostMapping("/adds")
    public void addBooks(@RequestBody List<BookCategory> books){
        bookCategoryservice.saveBooks(books);

    }

    @GetMapping("/list")
    public List<BookCategory> findAllBooks(){
        return bookCategoryservice.getBooks();
    }


    @GetMapping("/ById/{id}")
    public Optional<BookCategory> findBookbyId(@PathVariable int id){
        return bookCategoryservice.findBookbyId(id);
    }




}

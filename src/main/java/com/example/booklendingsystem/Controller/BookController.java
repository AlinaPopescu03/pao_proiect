package com.example.booklendingsystem.Controller;

import com.example.booklendingsystem.Model.Books;
import com.example.booklendingsystem.Service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RequestMapping("/api")
@RestController
public class BookController {

   public final  BookService bookService;

    @PostMapping("/boook")
    public void addBook(@RequestBody Books book){
        bookService.saveBook(book);

    }

    @PostMapping("/books")
    public void addBooks(@RequestBody List<Books> books){
        bookService.saveBooks(books);

    }

    @GetMapping("/lbooks")
    public List<Books> findAllBooks(){
        return bookService.getBooks();
    }


    @GetMapping("/BookById/{id}")
    public Books findBookbyId(@PathVariable int id){
        return bookService.getBookbyId(id);
    }


    @GetMapping("/BookbyName/{name}")
    public ResponseEntity<Books> findBookByName(@PathVariable String name){
        var book = bookService.getBookbyName(name);
        if ( book.isPresent()){
            return ResponseEntity.of(book);
        }
        return ResponseEntity.noContent().build();
    }

//
//    @PutMapping("/updateBook")
//    public Books updateProduct(@RequestBody Books book){
//        return bookService.updateBook(book);
//
//    }

    @DeleteMapping("/dbook/{id}")
    public String deleteBook(@PathVariable int id){
        return bookService.deleteBook(id);
    }

}

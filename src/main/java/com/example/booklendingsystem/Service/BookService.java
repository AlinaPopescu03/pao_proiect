package com.example.booklendingsystem.Service;

import com.example.booklendingsystem.Model.Books;
import com.example.booklendingsystem.Repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class BookService {


    private final BookRepository bookRepository;

    public void saveBook(Books book){
         bookRepository.save(book);
    }

    public void saveBooks(List<Books> books){
         bookRepository.saveAll(books);
    }

    public List<Books> getBooks(){
        return bookRepository.findAll();
    }

    public Books getBookbyId(int id){
        return bookRepository.findById(id).orElse(null);
    }

    public Optional<Books> getBookbyName(String name){
        return bookRepository.findByName(name);
    }

    public String deleteBook(int id){
        bookRepository.deleteById(id);
        return " Cartea cu id-ul " + id + " nu mai exista in aplicatie!";
    }

//    public Books updateBook(Books book){
//        Books existingBook = bookRepository.findById(book.getId()).orElse(null);
//        existingBook.setName(book.getName());
//        existingBook.setYear(book.getYear());
//        existingBook.setStatus(book.getStatus());
//        return bookRepository.save(existingBook);
//    }


}

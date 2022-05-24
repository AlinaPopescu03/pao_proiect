package com.example.booklendingsystem.Controller;

import com.example.booklendingsystem.Model.Books;
import com.example.booklendingsystem.Model.Prizes;
import com.example.booklendingsystem.Service.BookService;
import com.example.booklendingsystem.Service.PrizeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/prize")
@RestController
public class PrizeController {

    public final PrizeService prizeService;

    @PostMapping("/add")
    public void addPrize(@RequestBody Prizes prize){
        prizeService.savePrize(prize);

    }

//    @PostMapping("/addBooks")
//    public void addBooks(@RequestBody List<Books> books){
//        bookService.saveBooks(books);
//
//    }

    @GetMapping("/listPrizes")
    public List<Prizes> findAllPrizes(){
        return prizeService.getPrizes();
    }


//    @GetMapping("/BookById/{id}")
//    public Books findBookbyId(@PathVariable int id){
//        return bookService.getBookbyId(id);
//    }
//
//
//    @GetMapping("/BookbyName/{name}")
//    public ResponseEntity<Books> findBookByName(@PathVariable String name){
//        var book = bookService.getBookbyName(name);
//        if ( book.isPresent()){
//            return ResponseEntity.of(book);
//        }
//        return ResponseEntity.noContent().build();
//    }

//
//    @PutMapping("/updateBook")
//    public Books updateProduct(@RequestBody Books book){
//        return bookService.updateBook(book);
//
//    }

//    @DeleteMapping("/deleteBook/{id}")
//    public String deleteBook(@PathVariable int id){
//        return bookService.deleteBook(id);
//    }

}

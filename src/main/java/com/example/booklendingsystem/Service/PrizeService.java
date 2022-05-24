package com.example.booklendingsystem.Service;


import com.example.booklendingsystem.Model.Books;
import com.example.booklendingsystem.Model.Prizes;
import com.example.booklendingsystem.Repository.PrizeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PrizeService {

    private final PrizeRepository prizeRepository;

    public void savePrize(Prizes prize){
        prizeRepository.save(prize);
    }

//    public void saveBooks(List<Books> books){
//        bookRepository.saveAll(books);
//    }
//
    public List<Prizes> getPrizes(){
        return prizeRepository.findAll();
    }
//
//    public Books getBookbyId(int id){
//        return bookRepository.findById(id).orElse(null);
//    }
//
//    public Optional<Books> getBookbyName(String name){
//        return bookRepository.findByName(name);
//    }
//
//    public String deleteBook(int id){
//        bookRepository.deleteById(id);
//        return " Cartea cu id-ul " + id + " nu mai exista in aplicatie!";
//    }
}

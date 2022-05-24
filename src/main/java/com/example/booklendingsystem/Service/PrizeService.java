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

    public void savePrizes(List<Prizes> prizes){
        prizeRepository.saveAll(prizes);
    }

    public List<Prizes> getPrizes(){
        return prizeRepository.findAll();
    }

    public Prizes getPrizeById(int id){
        return prizeRepository.findById(id).orElse(null);
    }

    public Optional<Prizes> getPrizebyName(String name){
        return prizeRepository.findPrizeByName(name);
    }

    public String deletePrize(int id){
        prizeRepository.deleteById(id);
        return " Premiul cu id-ul " + id + " nu mai exista in aplicatie!";
    }
}

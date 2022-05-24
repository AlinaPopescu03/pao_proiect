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

    @PostMapping("/prize")
    public void addPrize(@RequestBody Prizes prize){
        prizeService.savePrize(prize);

    }

    @PostMapping("/prizes")
    public void addPrizes(@RequestBody List<Prizes> prizes){
        prizeService.savePrizes(prizes);

    }

    @GetMapping("/lprizes")
    public List<Prizes> findAllPrizes(){
        return prizeService.getPrizes();
    }


    @GetMapping("/byId/{id}")
    public Prizes findPrizeById(@PathVariable int id){
        return prizeService.getPrizeById(id);
    }


    @GetMapping("/byName/{name}")
    public ResponseEntity<Prizes> findPrizeByName(@PathVariable String name){
        var prize = prizeService.getPrizebyName(name);
        if ( prize.isPresent()){
            return ResponseEntity.of(prize);
        }
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/dprize/{id}")
    public String deletePrize(@PathVariable int id){
        return prizeService.deletePrize(id);
    }

}

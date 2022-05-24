package com.example.booklendingsystem.Controller;

import com.example.booklendingsystem.Model.Parteners;
import com.example.booklendingsystem.Service.PartenerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/partener")
public class PartenerController {


    public final PartenerService partenerService;

    @PostMapping("/add")
    public void addPartener(@RequestBody Parteners partener){
        partenerService.savePartener(partener);

    }

    @PostMapping("/addParteners")
    public void addParteners(@RequestBody List<Parteners> parteners){
         partenerService.saveParteners(parteners);

    }

    @GetMapping("/listParteners")
    public List<Parteners> findAllParteners(){
        return partenerService.getParteners();
    }


    @GetMapping("/PartenerById/{id}")
    public Parteners findPartenersById(@PathVariable int id){
        return partenerService.getPartenersById(id);
    }

//    @GetMapping("/byName/{name}")
//    public Parteners findPartenersByName(@PathVariable String name){
//        return partenerService.getParterbyName(name);
//    }

    @GetMapping("/PartenerbyName/{name}")
    public ResponseEntity<Parteners> findPartenerByName(@PathVariable String name){
        var partener = partenerService.getParterbyName(name);
        if ( partener.isPresent()){
            return ResponseEntity.of(partener);
        }
        return ResponseEntity.noContent().build();
    }


//    @PutMapping("/updatePartener")
//    public Parteners updatePartener(@RequestBody Parteners partener){
//        return partenerService.updatePartener(partener);
//
//    }

    @DeleteMapping("/deletePartener/{id}")
    public String deletePartener(@PathVariable int id){
        return partenerService.deletePartener(id);
    }

}

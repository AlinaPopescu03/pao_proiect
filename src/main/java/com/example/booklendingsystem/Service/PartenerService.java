package com.example.booklendingsystem.Service;


import com.example.booklendingsystem.Model.Parteners;
import com.example.booklendingsystem.Repository.PartenerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartenerService {

    @Autowired
    private PartenerRepository partenerRepository;

    public void savePartener(Parteners partener){
        partenerRepository.save(partener);
    }

    public void saveParteners(List<Parteners> parteners){
        partenerRepository.saveAll(parteners);
    }

    public List<Parteners> getParteners(){
        return partenerRepository.findAll();
    }

    public Parteners getPartenersById(int id){
        return partenerRepository.findById(id).orElse(null);
    }

    public Optional<Parteners> getParterbyName(String name){
        return partenerRepository.findPartenerByName(name);
    }

    public String deletePartener(int id){
        partenerRepository.deleteById(id);
        return " Partenerul cu id-ul " + id + " nu mai exista in aplicatie!";
    }

}

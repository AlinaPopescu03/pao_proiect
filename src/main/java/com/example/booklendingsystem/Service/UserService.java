package com.example.booklendingsystem.Service;

import com.example.booklendingsystem.Model.Users;
import com.example.booklendingsystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users saveUser(Users user){
        return userRepository.save(user);
    }

    public List<Users> saveUsers(List<Users> users){
        return userRepository.saveAll(users);
    }

    public List<Users> getUsers(){
        return userRepository.findAll();
    }

    public Users getUserById(int id){
        return userRepository.findById(id).orElse(null);
    }

    public Optional<Users> getUserbyName(String fname, String lname){
        return userRepository.findUserBy(fname, lname);
    }

    public String deleteUser(int id){
        userRepository.deleteById(id);
        return " Usersul cu id-ul " + id + " nu mai exista in aplicatie!";
    }

}
